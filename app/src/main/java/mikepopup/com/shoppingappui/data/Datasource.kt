package mikepopup.com.shoppingappui.data

import mikepopup.com.shoppingappui.R
import mikepopup.com.shoppingappui.model.CategoryData

class Datasource {

    fun loadCategoryWomen(): List<CategoryData>{
        return listOf<CategoryData>(
            CategoryData(R.string.Category1, R.drawable.new_in),
            CategoryData(R.string.Category2, R.drawable.clothes),
            CategoryData(R.string.Category3, R.drawable.shoes),
            CategoryData(R.string.Category4, R.drawable.accesories),


        )
    }
}