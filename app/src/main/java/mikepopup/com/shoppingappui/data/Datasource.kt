package mikepopup.com.shoppingappui.data

import mikepopup.com.shoppingappui.R
import mikepopup.com.shoppingappui.model.CategoryData

class Datasource {

    fun loadCategoryWomen(): List<CategoryData>{
        return listOf<CategoryData>(
            CategoryData(R.string.Category1),
            CategoryData(R.string.Category2),
            CategoryData(R.string.Category3),
            CategoryData(R.string.Category4),

        )
    }
}