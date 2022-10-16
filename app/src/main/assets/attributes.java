{
	"android.view.View" :
	[
		{
			"name" : "ID",
			"methodName" : "setId",
			"className" : "ViewCaller",
			"attributeName" : "android:id",
			"argumentType" : "id"
		},
		
		{
			"name" : "Layout Width",
			"methodName" : "setLayoutWidth",
			"className" : "ViewCaller",
			"attributeName" : "android:layout_width",
			"argumentType" : "size",
			"canDelete" : "false"
		},
		
		{
			"name" : "Layout Height",
			"methodName" : "setLayoutHeight",
			"className" : "ViewCaller",
			"attributeName" : "android:layout_height",
			"argumentType" : "size",
			"canDelete" : "false"
		},
		
		{
			"name" : "Background",
			"methodName" : "setBackground",
			"className" : "ViewCaller",
			"attributeName" : "android:background",
			"argumentType" : "color|drawable"
		},
		
		{
			"name" : "Elevation",
			"methodName" : "setElevation",
			"className" : "ViewCaller",
			"attributeName" : "android:elevation",
			"argumentType" : "dimension",
			"dimensionUnit" : "dp"
		},
		
		{
			"name" : "Alpha",
			"methodName" : "setAlpha",
			"className" : "ViewCaller",
			"attributeName" : "android:alpha",
			"argumentType" : "float"
		},
		
		{
			"name" : "Rotation",
			"methodName" : "setRotation",
			"className" : "ViewCaller",
			"attributeName" : "android:rotation",
			"argumentType" : "float"
		},
		
		{
			"name" : "Rotation X",
			"methodName" : "setRotationX",
			"className" : "ViewCaller",
			"attributeName" : "android:rotationX",
			"argumentType" : "float"
		},
		
		{
			"name" : "Rotation Y",
			"methodName" : "setRotationY",
			"className" : "ViewCaller",
			"attributeName" : "android:rotationY",
			"argumentType" : "float"
		},
		
		{
			"name" : "Padding",
			"methodName" : "setPadding",
			"className" : "ViewCaller",
			"attributeName" : "android:padding",
			"argumentType" : "dimension",
			"dimensionUnit" : "dp"
		},
		
		{
			"name" : "Padding Left",
			"methodName" : "setPaddingLeft",
			"className" : "ViewCaller",
			"attributeName" : "android:paddingLeft",
			"argumentType" : "dimension",
			"dimensionUnit" : "dp"
		},
		
		{
			"name" : "Padding Right",
			"methodName" : "setPaddingRight",
			"className" : "ViewCaller",
			"attributeName" : "android:paddingRight",
			"argumentType" : "dimension",
			"dimensionUnit" : "dp"
		},
		
		{
			"name" : "Padding Top",
			"methodName" : "setPaddingTop",
			"className" : "ViewCaller",
			"attributeName" : "android:paddingTop",
			"argumentType" : "dimension",
			"dimensionUnit" : "dp"
		},
		
		{
			"name" : "Padding Bottom",
			"methodName" : "setPaddingBottom",
			"className" : "ViewCaller",
			"attributeName" : "android:paddingBottom",
			"argumentType" : "dimension",
			"dimensionUnit" : "dp"
		}
	],
	
	"android.widget.LinearLayout" :
	[
		{
			"name" : "Gravity",
			"methodName" : "setGravity",
			"className" : "LinearLayoutCaller",
			"attributeName" : "android:gravity",
			"argumentType" : "flag",
			"arguments" : 
			[
				"left",
				"right",
				"top",
				"bottom",
				"center",
				"center_horizontal",
				"center_vertical"
			],
			"defaultValue" : "-1"
		},
		
		{
			"name" : "Orientation",
			"methodName" : "setOrientation",
			"className" : "LinearLayoutCaller",
			"attributeName" : "android:orientation",
			"argumentType" : "enum",
			"arguments" :
			[
				"horizontal",
				"vertical"
			],
			"defaultValue" : "-1"
		}
	],
	
	"android.widget.TextView" :
	[
		{
			"name" : "Text",
			"methodName" : "setText",
			"className" : "TextViewCaller",
			"attributeName" : "android:text",
			"argumentType" : "string"
		},
		
		{
			"name" : "Text Size",
			"methodName" : "setTextSize",
			"className" : "TextViewCaller",
			"attributeName" : "android:textSize",
			"argumentType" : "dimension",
			"dimensionUnit" : "sp"
		},
		
		{
			"name" : "Text Color",
			"methodName" : "setTextColor",
			"className" : "TextViewCaller",
			"attributeName" : "android:textColor",
			"argumentType" : "color"
		},
		
		{
			"name" : "Gravity",
			"methodName" : "setGravity",
			"className" : "TextViewCaller",
			"attributeName" : "android:gravity",
			"argumentType" : "flag",
			"arguments" : 
			[
				"left",
				"right",
				"top",
				"bottom",
				"center",
				"center_horizontal",
				"center_vertical"
			],
			"defaultValue" : "-1"
		}
	],
	
	"android.widget.EditText" :
	[
		{
			"name" : "Text Hint",
			"methodName" : "setTextHint",
			"className" : "TextViewCaller",
			"attributeName" : "android:hint",
			"argumentType" : "string"
		}
	]
}