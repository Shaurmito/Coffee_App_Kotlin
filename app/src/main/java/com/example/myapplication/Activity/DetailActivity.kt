package com.example.myapplication.Activity

import android.content.Context
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.example.myapplication.Model.ItemsModel
import com.example.myapplication.R
import com.example.myapplication.databinding.ActivityDetailBinding


class DetailActivity : BaseActivity() {
    private lateinit var binding: ActivityDetailBinding
    private lateinit var item: ItemsModel
    private lateinit var context: Context
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        context = this
        bundle()
    }
    private fun bundle() {
        binding.apply {
            item = intent.getParcelableExtra("object")!!
            titleTxt.text = item.title
            subtitleTxt.text = item.extra
            descriptionTxt.text = item.description
            priceTxt.text = "$"+item.price

            Glide.with(context)
                .load(item.picUrl[0])
                .apply(RequestOptions.bitmapTransform(RoundedCorners(100)))
                .into(binding.img)

            backBtn.setOnClickListener { finish() }

            sizeBtn1.setOnClickListener{
                sizeBtn1.setBackgroundDrawable(ContextCompat.getDrawable(context, R.drawable.orange_stroke_bg))
                sizeBtn2.setBackgroundDrawable(ContextCompat.getDrawable(context, R.drawable.dark_grey_bg))
                sizeBtn3.setBackgroundDrawable(ContextCompat.getDrawable(context, R.drawable.dark_grey_bg))
                sizeBtn1.setTextColor(getResources().getColor(R.color.orange))
                sizeBtn2.setTextColor(getResources().getColor(R.color.white))
                sizeBtn3.setTextColor(getResources().getColor(R.color.white))
            }

            sizeBtn2.setOnClickListener{
                sizeBtn2.setBackgroundDrawable(ContextCompat.getDrawable(context, R.drawable.orange_stroke_bg))
                sizeBtn1.setBackgroundDrawable(ContextCompat.getDrawable(context, R.drawable.dark_grey_bg))
                sizeBtn3.setBackgroundDrawable(ContextCompat.getDrawable(context, R.drawable.dark_grey_bg))
                sizeBtn2.setTextColor(getResources().getColor(R.color.orange))
                sizeBtn1.setTextColor(getResources().getColor(R.color.white))
                sizeBtn3.setTextColor(getResources().getColor(R.color.white))
            }

            sizeBtn3.setOnClickListener{
                sizeBtn3.setBackgroundDrawable(ContextCompat.getDrawable(context, R.drawable.orange_stroke_bg))
                sizeBtn2.setBackgroundDrawable(ContextCompat.getDrawable(context, R.drawable.dark_grey_bg))
                sizeBtn1.setBackgroundDrawable(ContextCompat.getDrawable(context, R.drawable.dark_grey_bg))
                sizeBtn3.setTextColor(getResources().getColor(R.color.orange))
                sizeBtn2.setTextColor(getResources().getColor(R.color.white))
                sizeBtn1.setTextColor(getResources().getColor(R.color.white))
            }

        }
    }
}