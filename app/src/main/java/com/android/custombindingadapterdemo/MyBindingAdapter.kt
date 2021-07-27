package com.android.custombindingadapterdemo

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import coil.load

// Custom Binding Adapter for loading image url to ImageView
// Here "loadImageFromURL" is the custom binding attribute

@BindingAdapter("loadImageFromURL")
fun ImageView.loadImage(imageUrl: String) {
    // load is the function of Coil Library
    this.load(imageUrl)
}