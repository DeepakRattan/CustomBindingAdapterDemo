# Demonstration of Custom Binding Adapter


1. Custom Binding Adapters are used if there is no attribute inside a view for performing required operation .

e.g. For ImageView there is no attribute which can load image url into it. Binding Adapter can be used to define the custom attributes for a view.

2. In our code ,"loadImageFromURL" is the custom attribute we have defined for ImageView using Binding Adapter. Please refer to MyBindingAdapter.kt file .

3. After defining custom Binding Adapter, we can use the custom attribute inside the ImageView. Please refer to activity_main.xml file.
