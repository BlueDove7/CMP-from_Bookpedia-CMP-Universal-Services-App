package com.plcoding.bookpedia.book.presentation.book_list

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults

//import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import cmp_bookpedia.composeapp.generated.resources.Res
import cmp_bookpedia.composeapp.generated.resources.search_hint
import com.plcoding.bookpedia.core.presentation.DarkBlue
import com.plcoding.bookpedia.core.presentation.SandYellow
import org.jetbrains.compose.resources.stringResource


@Composable
fun BookSearchBar(
    searchQuery: String,
    onSearchQueryChange: (String) -> Unit,
    onSearchIcon: () -> Unit,
    modifier: Modifier
) {
    OutlinedTextField(
        value = searchQuery,
        onValueChange = onSearchQueryChange,
        shape = RoundedCornerShape(100),
        colors = OutlinedTextFieldDefaults.colors(
            focusedBorderColor = SandYellow,
            cursorColor = DarkBlue
        ),
        placeholder = { Text(text = stringResource(Res.string.search_hint))},//Text(text = stringResource(Res.string.search_hint)) },
        leadingIcon = {Icon(imageVector = Icons.Default.Search, contentDescription = "", tint = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.66f),modifier = Modifier)}
    )
}
