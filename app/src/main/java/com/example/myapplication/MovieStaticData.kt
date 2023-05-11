package com.example.myapplication

fun getFavoriteMovies(): List<Movie> {
    return listOf(
        Movie(1,"Pride and prejudice",
            "Sparks fly when spirited Elizabeth Bennet meets single, rich, and proud Mr. Darcy. But Mr. Darcy reluctantly finds himself falling in love with a woman beneath his class. Can each overcome their own pride and prejudice?",
            "16.02.2005.","https://www.imdb.com/title/tt0414387/",
            "drama", "https://www.imdb.com/title/tt0414387/","https://www.imdb.com/title/tt0414387/"),
        Movie(2,"Harry Potter and the Sorcerer's Stone",
            "An orphaned boy enrolls in a school of wizardry, where he learns the truth about himself, his family and the terrible evil that haunts the magical world.",
            "14.11.2001.","https://www.imdb.com/title/tt0241527/",
            "fantasy", "https://www.imdb.com/title/tt0241527/", "https://www.imdb.com/title/tt0241527/"),
        Movie(3,"Harry Potter and the Prisoner of Askaban",
            "Harry Potter, Ron and Hermione return to Hogwarts School of Witchcraft and Wizardry for their third year of study, where they delve into the mystery surrounding an escaped prisoner who poses a dangerous threat to the young wizard.",
            "31.05.2004.","https://www.imdb.com/title/tt0304141/",
            "fantasy", "https://www.imdb.com/title/tt0304141/", "https://www.imdb.com/title/tt0304141/"),
        Movie(4,"Harry Potter and the Deathly Hallows: Part 2",
            "Harry, Ron, and Hermione search for Voldemort's remaining Horcruxes in their effort to destroy the Dark Lord as the final battle rages on at Hogwarts.",
            "13.07.2011.","https://www.imdb.com/title/tt1201607/",
            "fantasy", "https://www.imdb.com/title/tt1201607/", "https://www.imdb.com/title/tt1201607/"),
        Movie(5,"Winnetou",
            "When violent conflict breaks out between greedy railroaders and a tribe of Mescalero Apaches, only two men, destined to be blood brothers, can prevent all-out war: chief's son Winnetou and German engineer Old Shatterhand.",
            "11.12.1963.","https://www.imdb.com/title/tt0057687/",
            "western", "https://www.imdb.com/title/tt0057687/","https://www.imdb.com/title/tt0057687/"),

    )
}

fun getRecentMovies(): List<Movie> {
    return listOf(
        Movie(1,"Creed III",
            "Adonis has been thriving in both his career and family life, but when a childhood friend and former boxing prodigy resurfaces, the face-off is more than just a fight.",
            "03.03.2023.","https://www.imdb.com/title/tt11145118/",
            "drama", "https://www.imdb.com/title/tt11145118/", "https://www.imdb.com/title/tt11145118/"),
        Movie(2,"John Wick: Chapter 4",
            "John Wick uncovers a path to defeating The High Table. But before he can earn his freedom, Wick must face off against a new enemy with powerful alliances across the globe and forces that turn old friends into foes.",
            "24.03.2023.","https://www.imdb.com/title/tt10366206/",
            "action", "https://www.imdb.com/title/tt10366206/", "https://www.imdb.com/title/tt10366206/"),
        Movie(3,"Shazam! Fury of the Gods",
            "The film continues the story of teenage Billy Batson who, upon reciting the magic word \"SHAZAM!\" is transformed into his adult Super Hero alter ego, Shazam.",
            "17.03.2023.","https://www.imdb.com/title/tt10151854/",
            "action", "https://www.imdb.com/title/tt10151854/", "https://www.imdb.com/title/tt10151854/"),
        Movie(4,"Dungeons & Dragons: Honor Among Thieves",
            "A charming thief and a band of unlikely adventurers embark on an epic quest to retrieve a lost relic, but things go dangerously awry when they run afoul of the wrong people.",
            "31.03.2023.","https://www.imdb.com/title/tt2906216/",
            "fantasy", "https://www.imdb.com/title/tt2906216/", "https://www.imdb.com/title/tt2906216/"),
        Movie(5,"Scream VI",
            "In the next installment, the survivors of the Ghostface killings leave Woodsboro behind and start a fresh chapter in New York City.",
            "10.03.2023.","https://www.imdb.com/title/tt17663992/",
            "horror", "https://www.imdb.com/title/tt17663992/", "https://www.imdb.com/title/tt17663992/"),
        Movie(6,"Love again",
            "A young woman tries to ease the pain of her fiancé's death by sending romantic texts to his old cell phone number, and forms a connection with the man the number has been reassigned to.",
            "12.05.2023.","https://www.imdb.com/title/tt10276482/",
            "romance", "https://www.imdb.com/title/tt10276482/", "https://www.imdb.com/title/tt10276482/"),
    )
}