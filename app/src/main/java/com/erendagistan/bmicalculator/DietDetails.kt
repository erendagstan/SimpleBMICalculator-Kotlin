package com.erendagistan.bmicalculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.erendagistan.bmicalculator.databinding.ActivityDietDetailsBinding

class DietDetails : AppCompatActivity() {
    private lateinit var binding : ActivityDietDetailsBinding
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityDietDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val result =intent.getStringExtra("result")
        binding.tvResult.text=result.toString()
        val color = intent.getIntExtra("color",0)
        binding.tvResult.setTextColor(ContextCompat.getColor(this,color))

        val hint = "Note: This diet program is intended as a general example and can be adapted to fit an individual's specific needs. Additionally, regular exercise is important for healthy weight loss."

        when(result){
            "Obese"-> binding.tvDietDetails.text="Here's an example diet program for a person with a BMI that qualifies as obese. However, it's important to keep in mind that different individuals may have different dietary needs, so this program should be considered a general example only. Additionally, it's important to consult with a healthcare professional before beginning any diet program.\n" +
                    "\n" +
                    "Morning:\n" +
                    "\n" +
                    "1 slice of whole wheat bread\n" +
                    "2 slices of grilled turkey or chicken breast\n" +
                    "1 boiled egg\n" +
                    "1 cup of unsweetened green tea or coffee\n" + "\n"+
                    "Snack:\n" +
                    "\n" +
                    "1 medium-sized apple\n" +
                    "1 handful of walnuts or almonds\n" + "\n"+
                    "Lunch:\n" +
                    "\n" +
                    "1 serving of grilled fish (such as salmon, mackerel, or sea bass)\n" +
                    "1 serving of brown rice or bulgur pilaf\n" +
                    "1 serving of vegetable salad (such as lettuce, tomato, cucumber, parsley, and bell pepper)\n" +
                    "1 cup of unsweetened ayran (a type of Turkish yogurt drink)\n" + "\n"+
                    "Snack:\n" +
                    "\n" +
                    "1 medium-sized banana\n" +
                    "1 handful of hazelnuts or almonds\n" + "\n"+
                    "Dinner:\n" +
                    "\n" +
                    "1 serving of grilled chicken or turkey breast\n" +
                    "1 serving of vegetable and oatmeal mash\n" +
                    "1 serving of yogurt\n" + "\n" +
                    "Snack:\n" +
                    "\n" +
                    "1 medium-sized orange or tangerine\n" + "\n" +
                    hint

            "Overweight"->binding.tvDietDetails.text="Here's an example diet program for a person with a BMI that qualifies as overweight. However, it's important to keep in mind that different individuals may have different dietary needs, so this program should be considered a general example only. Additionally, it's important to consult with a healthcare professional before beginning any diet program.\n" +
                    "\n" +
                    "Morning:\n" +
                    "\n" +
                    "1 slice of whole wheat bread\n" +
                    "1 boiled egg\n" +
                    "2 slices of grilled turkey or chicken breast\n" +
                    "1 cup of unsweetened green tea or coffee\n" + "\n"+
                    "Snack:\n" +
                    "\n" +
                    "1 medium-sized pear\n" +
                    "1 handful of almonds or walnuts\n" + "\n"+
                    "Lunch:\n" +
                    "\n" +
                    "1 serving of grilled salmon or sea bass\n" +
                    "1 serving of brown rice or quinoa\n" +
                    "1 serving of vegetable salad (such as lettuce, tomato, cucumber, parsley, and bell pepper)\n" +
                    "1 cup of unsweetened ayran (a type of Turkish yogurt drink)\n" + "\n"+
                    "Snack:\n" +
                    "\n" +
                    "1 medium-sized orange\n" +
                    "1 handful of hazelnuts or pistachios\n" + "\n"+
                    "Dinner:\n" +
                    "\n" +
                    "1 serving of grilled chicken or turkey breast\n" +
                    "1 serving of vegetable and lentil stew\n" +
                    "1 slice of whole wheat bread\n" + "\n" +
                    "Snack:\n" +
                    "\n" +
                    "1 small-sized banana" + "\n" + "\n" +
                    hint

            "Normal"->binding.tvDietDetails.text="Here's an example diet program for a person with a normal BMI. However, it's important to keep in mind that different individuals may have different dietary needs, so this program should be considered a general example only. Additionally, it's important to consult with a healthcare professional before beginning any diet program.\n" +
                    "\n" +
                    "Morning:\n" +
                    "\n" +
                    "1 slice of whole wheat bread\n" +
                    "1 boiled egg\n" +
                    "1 slice of low-fat cheese\n" +
                    "1 cup of unsweetened green tea or coffee\n" +  "\n" +
                    "Snack:\n" +
                    "\n" +
                    "1 medium-sized apple\n" +
                    "1 handful of almonds or hazelnuts\n" +  "\n" +
                    "Lunch:\n" +
                    "\n" +
                    "1 serving of grilled chicken or turkey breast\n" +
                    "1 serving of brown rice or bulgur pilaf\n" +
                    "1 serving of vegetable salad (such as lettuce, tomato, cucumber, parsley, and bell pepper)\n" +
                    "1 cup of unsweetened ayran (a type of Turkish yogurt drink)\n" +  "\n" +
                    "Snack:\n" +
                    "\n" +
                    "1 medium-sized orange\n" +
                    "1 slice of whole wheat bread\n" +
                    "1 slice of low-fat cheese\n" +  "\n" +
                    "Dinner:\n" +
                    "\n" +
                    "1 serving of grilled salmon or sea bass\n" +
                    "1 serving of vegetable and lentil stew\n" +
                    "1 slice of whole wheat bread\n" + "\n"+
                    "Snack:\n" +
                    "\n" +
                    "1 medium-sized pear\n" +
                    "1 handful of walnuts or pistachios"  + "\n" +  "\n" +
                    hint

            "Underweight"->binding.tvDietDetails.text="Here's an example diet program for a person with a BMI that falls under the underweight category. However, it's important to keep in mind that different individuals may have different dietary needs, so this program should be considered a general example only. Additionally, it's important to consult with a healthcare professional before beginning any diet program.\n" +
                    "\n" +
                    "Morning:\n" +
                    "\n" +
                    "1 sliced banana\n" +
                    "1 cup of oatmeal (prepared with milk or almond milk)\n" +
                    "1 handful of dried apricots\n" +  "\n" +
                    "Snack:\n" +
                    "\n" +
                    "1 small banana\n" +
                    "1 slice of whole wheat bread\n" +
                    "2 tablespoons of peanut butter\n" +  "\n" +
                    "Lunch:\n" +
                    "\n" +
                    "1 serving of grilled chicken breast or turkey breast\n" +
                    "1 serving of brown rice or whole wheat pasta\n" +
                    "1 serving of vegetable salad (such as lettuce, tomato, cucumber, parsley, and bell pepper)\n" +
                    "1 cup of freshly squeezed fruit juice\n" +  "\n" +
                    "Snack:\n" +
                    "\n" +
                    "1 avocado\n" +
                    "1 slice of whole wheat bread\n" +
                    "1 slice of full-fat white cheese\n" +  "\n" +
                    "Dinner:\n" +
                    "\n" +
                    "1 serving of grilled salmon or sea bass\n" +
                    "1 serving of vegetable and brown rice pilaf\n" +
                    "1 cup of yogurt\n" +  "\n" +
                    "Snack:\n" +
                    "\n" +
                    "1 handful of nuts\n" +
                    "1 small apple\n" +  "\n" +
                    hint

        }
    }
}