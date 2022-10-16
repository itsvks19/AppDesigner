package com.jonys.appdesigner.activities;

import android.os.Bundle;
import android.widget.BaseAdapter;
import android.view.View;
import android.view.ViewGroup;

import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.tabs.TabLayout;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import com.itsaky.androidide.logsender.LogSender;
import com.jonys.appdesigner.databinding.ActivityEditorBinding;
import com.jonys.appdesigner.databinding.ListViewItemBinding;
import com.jonys.appdesigner.tools.StructureView;
import com.jonys.appdesigner.utils.FileUtil;
import com.jonys.appdesigner.utils.InvokeUtil;

import java.util.ArrayList;
import java.util.HashMap;

public class EditorActivity extends BaseActivity {

	private ActivityEditorBinding binding;
	
	private ArrayList<HashMap<String, Object>> views;
	private ArrayList<HashMap<String, Object>> layouts;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
		LogSender.startLogging(this);
		
		binding = ActivityEditorBinding.inflate(getLayoutInflater());
		setContentView(binding.getRoot());
		
		binding.editorLayout.setStructureView(binding.structureView);
		binding.structureView.setOnItemClickListener(new StructureView.OnItemClickListener() {

			@Override
			public void onItemClick(View view) {
				binding.editorLayout.showDefinedAttributes(view);
				binding.drawer.closeDrawer(GravityCompat.END);
			}
		});
		
		//drawer
		binding.drawer.setScrimColor(0x00000000);
		binding.drawer.setDrawerElevation(20);
		
		binding.btnMenu.setOnClickListener(v -> binding.drawer.openDrawer(GravityCompat.START));
		binding.btnStructure.setOnClickListener(v -> binding.drawer.openDrawer(GravityCompat.END));
		
		//list views groups
		binding.tabLayout.addTab(binding.tabLayout.newTab().setText("Views"));
		binding.tabLayout.addTab(binding.tabLayout.newTab().setText("Layouts"));
		binding.tabLayout.setOnTabSelectedListener(new TabLayout.BaseOnTabSelectedListener() {
			
			@Override
			public void onTabSelected(TabLayout.Tab tab) {
				if(tab.getPosition() == 0) {
					binding.listView.setAdapter(new ListViewAdapter(views));
				} else {
					binding.listView.setAdapter(new ListViewAdapter(layouts));
				}
			}

			@Override
			public void onTabUnselected(TabLayout.Tab tab) {
			}

			@Override
			public void onTabReselected(TabLayout.Tab tab) {
			}
		});
		
		//load views from assets
		views = new Gson().fromJson(FileUtil.readFromAsset("views.java", this), new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
		layouts = new Gson().fromJson(FileUtil.readFromAsset("layouts.java", this), new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
		
		binding.listView.setAdapter(new ListViewAdapter(views));
	}
	
	private class ListViewAdapter extends BaseAdapter implements View.OnLongClickListener {
		
		private ArrayList<HashMap<String, Object>> list;
		
		public ListViewAdapter(ArrayList<HashMap<String, Object>> list) {
			this.list = list;
		}
		
		@Override
		public int getCount() {
			return list.size();
		}
		
		@Override
		public long getItemId(int arg0) {
			return 0;
		}
		
		@Override
		public HashMap<String, Object> getItem(int pos) {
			return list.get(pos);
		}
		
		@Override
		public View getView(int pos, View buffer, ViewGroup parent) {
			ListViewItemBinding bind = ListViewItemBinding.inflate(getLayoutInflater());
			bind.name.setText(getItem(pos).get("name").toString());
			bind.image.setImageResource(InvokeUtil.getMipmapId(getItem(pos).get("iconName").toString()));
			
			bind.getRoot().setOnLongClickListener(this);
			bind.getRoot().setTag(pos);
			bind.getRoot().post(() -> {
				bind.getRoot().setTranslationX(-bind.getRoot().getWidth());
				bind.getRoot().animate().translationX(0).setStartDelay(pos * 30).setDuration(300).start();
			});
			
			return bind.getRoot();
		}
		
		@Override
		public boolean onLongClick(View v) {
			v.startDragAndDrop(null, new View.DragShadowBuilder(v), list.get((int) v.getTag()), 0);
			binding.drawer.closeDrawer(GravityCompat.START);
			return true;
		}
	}
}