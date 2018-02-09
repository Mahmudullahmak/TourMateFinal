package com.android.zsm.tourmatefinal;

import android.content.SearchRecentSuggestionsProvider;

/**
 * Created by Devils God on 2/9/2018.
 */

public class SearchSuggestions extends SearchRecentSuggestionsProvider {
    public static final String AUTHORITY ="com.example.devilsgod.weatherappfinale.SearchSuggestions";
    public static final int MODE = DATABASE_MODE_QUERIES;

    public SearchSuggestions() {
        setupSuggestions(AUTHORITY,MODE);
    }
}

