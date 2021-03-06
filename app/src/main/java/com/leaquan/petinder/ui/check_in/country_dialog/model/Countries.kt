package com.leaquan.petinder.ui.check_in.country_dialog.model

class Countries {
    val COUNTRIES: ArrayList<Country> = ArrayList()
        get() = field

    fun getCountries(code: String) : Country?  {
        val countries = COUNTRIES.filter {
            it.getCode() == code.uppercase()
        }
        if (countries.isNotEmpty()){
            return countries[0]
        }
        return null
    }

    init {
        COUNTRIES.add(
            Country(
                "vn",
                "Vietnam (Việt Nam)",
                84
            )
        )
        COUNTRIES.add(
            Country(
                "kr",
                "South Korea (대한민국)",
                82
            )
        )
        COUNTRIES.add(
            Country(
                "cn",
                "China (中国)",
                86
            )
        )

        COUNTRIES.add(
            Country(
                "in",
                "India (भारत)",
                91
            )
        )
        COUNTRIES.add(
            Country(
                "id",
                "Indonesia",
                62
            )
        )
        COUNTRIES.add(
            Country(
                "pk",
                "Pakistan (‫پاکستان‬‎)",
                92
            )
        )
        COUNTRIES.add(
            Country(
                "th",
                "Thailand (ไทย)",
                66
            )
        )

        COUNTRIES.add(
            Country(
                "af",
                "Afghanistan (‫افغانستان‬‎)",
                93
            )
        )
        COUNTRIES.add(
            Country(
                "al",
                "Albania (Shqipëri)",
                355
            )
        )
        COUNTRIES.add(
            Country(
                "dz",
                "Algeria (‫الجزائر‬‎)",
                213
            )
        )
        COUNTRIES.add(
            Country(
                "as",
                "American Samoa",
                1684
            )
        )
        COUNTRIES.add(
            Country(
                "ad",
                "Andorra",
                376
            )
        )
        COUNTRIES.add(
            Country(
                "ao",
                "Angola",
                244
            )
        )
        COUNTRIES.add(
            Country(
                "ai",
                "Anguilla",
                1264
            )
        )
        COUNTRIES.add(
            Country(
                "ag",
                "Antigua and Barbuda",
                1268
            )
        )
        COUNTRIES.add(
            Country(
                "ar",
                "Argentina",
                54
            )
        )
        COUNTRIES.add(
            Country(
                "am",
                "Armenia (Հայաստան)",
                374
            )
        )
        COUNTRIES.add(
            Country(
                "aw",
                "Aruba",
                297
            )
        )
        COUNTRIES.add(
            Country(
                "au",
                "Australia",
                61
            )
        )
        COUNTRIES.add(
            Country(
                "at",
                "Austria (Österreich)",
                43
            )
        )
        COUNTRIES.add(
            Country(
                "az",
                "Azerbaijan (Azərbaycan)",
                994
            )
        )
        COUNTRIES.add(
            Country(
                "bs",
                "Bahamas",
                1242
            )
        )
        COUNTRIES.add(
            Country(
                "bh",
                "Bahrain (‫البحرين‬‎)",
                973
            )
        )
        COUNTRIES.add(
            Country(
                "bd",
                "Bangladesh (বাংলাদেশ)",
                880
            )
        )
        COUNTRIES.add(
            Country(
                "bb",
                "Barbados",
                1246
            )
        )
        COUNTRIES.add(
            Country(
                "by",
                "Belarus (Беларусь)",
                375
            )
        )
        COUNTRIES.add(
            Country(
                "be",
                "Belgium (België)",
                32
            )
        )
        COUNTRIES.add(
            Country(
                "bz",
                "Belize",
                501
            )
        )
        COUNTRIES.add(
            Country(
                "bj",
                "Benin (Bénin)",
                229
            )
        )
        COUNTRIES.add(
            Country(
                "bm",
                "Bermuda",
                1441
            )
        )
        COUNTRIES.add(
            Country(
                "bt",
                "Bhutan (འབྲུག)",
                975
            )
        )
        COUNTRIES.add(
            Country(
                "bo",
                "Bolivia",
                591
            )
        )
        COUNTRIES.add(
            Country(
                "ba",
                "Bosnia and Herzegovina (Босна и Херцеговина)",
                387
            )
        )
        COUNTRIES.add(
            Country(
                "bw",
                "Botswana",
                267
            )
        )
        COUNTRIES.add(
            Country(
                "br",
                "Brazil (Brasil)",
                55
            )
        )
        COUNTRIES.add(
            Country(
                "io",
                "British Indian Ocean Territory",
                246
            )
        )
        COUNTRIES.add(
            Country(
                "vg",
                "British Virgin Islands",
                1284
            )
        )
        COUNTRIES.add(
            Country(
                "bn",
                "Brunei",
                673
            )
        )
        COUNTRIES.add(
            Country(
                "bg",
                "Bulgaria (България)",
                359
            )
        )
        COUNTRIES.add(
            Country(
                "bf",
                "Burkina Faso",
                226
            )
        )
        COUNTRIES.add(
            Country(
                "bi",
                "Burundi (Uburundi)",
                257
            )
        )
        COUNTRIES.add(
            Country(
                "kh",
                "Cambodia (កម្ពុជា)",
                855
            )
        )
        COUNTRIES.add(
            Country(
                "cm",
                "Cameroon (Cameroun)",
                237
            )
        )
        COUNTRIES.add(
            Country(
                "ca",
                "Canada",
                1
            )
        )
        COUNTRIES.add(
            Country(
                "cv",
                "Cape Verde (Kabu Verdi)",
                238
            )
        )
        COUNTRIES.add(
            Country(
                "bq",
                "Caribbean Netherlands",
                599
            )
        )
        COUNTRIES.add(
            Country(
                "ky",
                "Cayman Islands",
                1345
            )
        )
        COUNTRIES.add(
            Country(
                "cf",
                "Central African Republic (République centrafricaine)",
                236
            )
        )
        COUNTRIES.add(
            Country(
                "td",
                "Chad (Tchad)",
                235
            )
        )
        COUNTRIES.add(
            Country(
                "cl",
                "Chile",
                56
            )
        )

        COUNTRIES.add(
            Country(
                "cx",
                "Christmas Island",
                61
            )
        )
        COUNTRIES.add(
            Country(
                "cc",
                "Cocos (Keeling) Islands",
                61
            )
        )
        COUNTRIES.add(
            Country(
                "co",
                "Colombia",
                57
            )
        )
        COUNTRIES.add(
            Country(
                "km",
                "Comoros (‫جزر القمر‬‎)",
                269
            )
        )
        COUNTRIES.add(
            Country(
                "cd",
                "Congo (DRC) (Jamhuri ya Kidemokrasia ya Kongo)",
                243
            )
        )
        COUNTRIES.add(
            Country(
                "cg",
                "Congo (Republic) (Congo-Brazzaville)",
                242
            )
        )
        COUNTRIES.add(
            Country(
                "ck",
                "Cook Islands",
                682
            )
        )
        COUNTRIES.add(
            Country(
                "cr",
                "Costa Rica",
                506
            )
        )
        COUNTRIES.add(
            Country(
                "ci",
                "Côte d’Ivoire",
                225
            )
        )
        COUNTRIES.add(
            Country(
                "hr",
                "Croatia (Hrvatska)",
                385
            )
        )
        COUNTRIES.add(
            Country(
                "cu",
                "Cuba",
                53
            )
        )
        COUNTRIES.add(
            Country(
                "cw",
                "Curaçao",
                599
            )
        )
        COUNTRIES.add(
            Country(
                "cy",
                "Cyprus (Κύπρος)",
                357
            )
        )
        COUNTRIES.add(
            Country(
                "cz",
                "Czech Republic (Česká republika)",
                420
            )
        )
        COUNTRIES.add(
            Country(
                "dk",
                "Denmark (Danmark)",
                45
            )
        )
        COUNTRIES.add(
            Country(
                "dj",
                "Djibouti",
                253
            )
        )
        COUNTRIES.add(
            Country(
                "dm",
                "Dominica",
                1767
            )
        )
        COUNTRIES.add(
            Country(
                "dom",
                "Dominican Republic (República Dominicana)",
                1
            )
        )
        COUNTRIES.add(
            Country(
                "ec",
                "Ecuador",
                593
            )
        )
        COUNTRIES.add(
            Country(
                "eg",
                "Egypt (‫مصر‬‎)",
                20
            )
        )
        COUNTRIES.add(
            Country(
                "sv",
                "El Salvador",
                503
            )
        )
        COUNTRIES.add(
            Country(
                "gq",
                "Equatorial Guinea (Guinea Ecuatorial)",
                240
            )
        )
        COUNTRIES.add(
            Country(
                "er",
                "Eritrea",
                291
            )
        )
        COUNTRIES.add(
            Country(
                "ee",
                "Estonia (Eesti)",
                372
            )
        )
        COUNTRIES.add(
            Country(
                "et",
                "Ethiopia",
                251
            )
        )
        COUNTRIES.add(
            Country(
                "fk",
                "Falkland Islands (Islas Malvinas)",
                500
            )
        )
        COUNTRIES.add(
            Country(
                "fo",
                "Faroe Islands (Føroyar)",
                298
            )
        )
        COUNTRIES.add(
            Country(
                "fj",
                "Fiji",
                679
            )
        )
        COUNTRIES.add(
            Country(
                "fi",
                "Finland (Suomi)",
                358
            )
        )
        COUNTRIES.add(
            Country(
                "fr",
                "France",
                33
            )
        )
        COUNTRIES.add(
            Country(
                "gf",
                "French Guiana (Guyane française)",
                594
            )
        )
        COUNTRIES.add(
            Country(
                "pf",
                "French Polynesia (Polynésie française)",
                689
            )
        )
        COUNTRIES.add(
            Country(
                "ga",
                "Gabon",
                241
            )
        )
        COUNTRIES.add(
            Country(
                "gm",
                "Gambia",
                220
            )
        )
        COUNTRIES.add(
            Country(
                "ge",
                "Georgia (საქართველო)",
                995
            )
        )
        COUNTRIES.add(
            Country(
                "de",
                "Germany (Deutschland)",
                49
            )
        )
        COUNTRIES.add(
            Country(
                "gh",
                "Ghana (Gaana)",
                233
            )
        )
        COUNTRIES.add(
            Country(
                "gi",
                "Gibraltar",
                350
            )
        )
        COUNTRIES.add(
            Country(
                "gr",
                "Greece (Ελλάδα)",
                30
            )
        )
        COUNTRIES.add(
            Country(
                "gl",
                "Greenland (Kalaallit Nunaat)",
                299
            )
        )
        COUNTRIES.add(
            Country(
                "gd",
                "Grenada",
                1473
            )
        )
        COUNTRIES.add(
            Country(
                "gp",
                "Guadeloupe",
                590
            )
        )
        COUNTRIES.add(
            Country(
                "gu",
                "Guam",
                1671
            )
        )
        COUNTRIES.add(
            Country(
                "gt",
                "Guatemala",
                502
            )
        )
        COUNTRIES.add(
            Country(
                "gg",
                "Guernsey",
                44
            )
        )
        COUNTRIES.add(
            Country(
                "gn",
                "Guinea (Guinée)",
                224
            )
        )
        COUNTRIES.add(
            Country(
                "gw",
                "Guinea-Bissau (Guiné Bissau)",
                245
            )
        )
        COUNTRIES.add(
            Country(
                "gy",
                "Guyana",
                592
            )
        )
        COUNTRIES.add(
            Country(
                "ht",
                "Haiti",
                509
            )
        )
        COUNTRIES.add(
            Country(
                "hn",
                "Honduras",
                504
            )
        )
        COUNTRIES.add(
            Country(
                "hk",
                "Hong Kong (香港)",
                852
            )
        )
        COUNTRIES.add(
            Country(
                "hu",
                "Hungary (Magyarország)",
                36
            )
        )
        COUNTRIES.add(
            Country(
                "is",
                "Iceland (Ísland)",
                354
            )
        )

        COUNTRIES.add(
            Country(
                "ir",
                "Iran (‫ایران‬‎)",
                98
            )
        )
        COUNTRIES.add(
            Country(
                "iq",
                "Iraq (‫العراق‬‎)",
                964
            )
        )
        COUNTRIES.add(
            Country(
                "ie",
                "Ireland",
                353
            )
        )
        COUNTRIES.add(
            Country(
                "im",
                "Isle of Man",
                44
            )
        )
        COUNTRIES.add(
            Country(
                "il",
                "Israel (‫ישראל‬‎)",
                972
            )
        )
        COUNTRIES.add(
            Country(
                "it",
                "Italy (Italia)",
                39
            )
        )
        COUNTRIES.add(
            Country(
                "jm",
                "Jamaica",
                1876
            )
        )
        COUNTRIES.add(
            Country(
                "jp",
                "Japan (日本)",
                81
            )
        )
        COUNTRIES.add(
            Country(
                "je",
                "Jersey",
                44
            )
        )
        COUNTRIES.add(
            Country(
                "jo",
                "Jordan (‫الأردن‬‎)",
                962
            )
        )
        COUNTRIES.add(
            Country(
                "kz",
                "Kazakhstan (Казахстан)",
                7
            )
        )
        COUNTRIES.add(
            Country(
                "ke",
                "Kenya",
                254
            )
        )
        COUNTRIES.add(
            Country(
                "ki",
                "Kiribati",
                686
            )
        )
        COUNTRIES.add(
            Country(
                "kw",
                "Kuwait (‫الكويت‬‎)",
                965
            )
        )
        COUNTRIES.add(
            Country(
                "kg",
                "Kyrgyzstan (Кыргызстан)",
                996
            )
        )
        COUNTRIES.add(
            Country(
                "la",
                "Laos (ລາວ)",
                856
            )
        )
        COUNTRIES.add(
            Country(
                "lv",
                "Latvia (Latvija)",
                371
            )
        )
        COUNTRIES.add(
            Country(
                "lb",
                "Lebanon (‫لبنان‬‎)",
                961
            )
        )
        COUNTRIES.add(
            Country(
                "ls",
                "Lesotho",
                266
            )
        )
        COUNTRIES.add(
            Country(
                "lr",
                "Liberia",
                231
            )
        )
        COUNTRIES.add(
            Country(
                "ly",
                "Libya (‫ليبيا‬‎)",
                218
            )
        )
        COUNTRIES.add(
            Country(
                "li",
                "Liechtenstein",
                423
            )
        )
        COUNTRIES.add(
            Country(
                "lt",
                "Lithuania (Lietuva)",
                370
            )
        )
        COUNTRIES.add(
            Country(
                "lu",
                "Luxembourg",
                352
            )
        )
        COUNTRIES.add(
            Country(
                "mo",
                "Macau (澳門)",
                853
            )
        )
        COUNTRIES.add(
            Country(
                "mk",
                "Macedonia (FYROM) (Македонија)",
                389
            )
        )
        COUNTRIES.add(
            Country(
                "mg",
                "Madagascar (Madagasikara)",
                261
            )
        )
        COUNTRIES.add(
            Country(
                "mw",
                "Malawi",
                265
            )
        )
        COUNTRIES.add(
            Country(
                "my",
                "Malaysia",
                60
            )
        )
        COUNTRIES.add(
            Country(
                "mv",
                "Maldives",
                960
            )
        )
        COUNTRIES.add(
            Country(
                "ml",
                "Mali",
                223
            )
        )
        COUNTRIES.add(
            Country(
                "mt",
                "Malta",
                356
            )
        )
        COUNTRIES.add(
            Country(
                "mh",
                "Marshall Islands",
                692
            )
        )
        COUNTRIES.add(
            Country(
                "mq",
                "Martinique",
                596
            )
        )
        COUNTRIES.add(
            Country(
                "mr",
                "Mauritania (‫موريتانيا‬‎)",
                222
            )
        )
        COUNTRIES.add(
            Country(
                "mu",
                "Mauritius (Moris)",
                230
            )
        )
        COUNTRIES.add(
            Country(
                "yt",
                "Mayotte",
                262
            )
        )
        COUNTRIES.add(
            Country(
                "mx",
                "Mexico (México)",
                52
            )
        )
        COUNTRIES.add(
            Country(
                "fm",
                "Micronesia",
                691
            )
        )
        COUNTRIES.add(
            Country(
                "md",
                "Moldova (Republica Moldova)",
                373
            )
        )
        COUNTRIES.add(
            Country(
                "mc",
                "Monaco",
                377
            )
        )
        COUNTRIES.add(
            Country(
                "mn",
                "Mongolia (Монгол)",
                976
            )
        )
        COUNTRIES.add(
            Country(
                "me",
                "Montenegro (Crna Gora)",
                382
            )
        )
        COUNTRIES.add(
            Country(
                "ms",
                "Montserrat",
                1664
            )
        )
        COUNTRIES.add(
            Country(
                "ma",
                "Morocco (‫المغرب‬‎)",
                212
            )
        )
        COUNTRIES.add(
            Country(
                "mz",
                "Mozambique (Moçambique)",
                258
            )
        )
        COUNTRIES.add(
            Country(
                "mm",
                "Myanmar (Burma) (မြန်မာ)",
                95
            )
        )
        COUNTRIES.add(
            Country(
                "na",
                "Namibia (Namibië)",
                264
            )
        )
        COUNTRIES.add(
            Country(
                "nr",
                "Nauru",
                674
            )
        )
        COUNTRIES.add(
            Country(
                "np",
                "Nepal (नेपाल)",
                977
            )
        )
        COUNTRIES.add(
            Country(
                "nl",
                "Netherlands (Nederland)",
                31
            )
        )
        COUNTRIES.add(
            Country(
                "nc",
                "New Caledonia (Nouvelle-Calédonie)",
                687
            )
        )
        COUNTRIES.add(
            Country(
                "nz",
                "New Zealand",
                64
            )
        )
        COUNTRIES.add(
            Country(
                "ni",
                "Nicaragua",
                505
            )
        )
        COUNTRIES.add(
            Country(
                "ne",
                "Niger (Nijar)",
                227
            )
        )
        COUNTRIES.add(
            Country(
                "ng",
                "Nigeria",
                234
            )
        )
        COUNTRIES.add(
            Country(
                "nu",
                "Niue",
                683
            )
        )
        COUNTRIES.add(
            Country(
                "nf",
                "Norfolk Island",
                672
            )
        )
        COUNTRIES.add(
            Country(
                "kp",
                "North Korea (조선 민주주의 인민 공화국)",
                850
            )
        )
        COUNTRIES.add(
            Country(
                "mp",
                "Northern Mariana Islands",
                1670
            )
        )
        COUNTRIES.add(
            Country(
                "no",
                "Norway (Norge)",
                47
            )
        )
        COUNTRIES.add(
            Country(
                "om",
                "Oman (‫عُمان‬‎)",
                968
            )
        )

        COUNTRIES.add(
            Country(
                "pw",
                "Palau",
                680
            )
        )
        COUNTRIES.add(
            Country(
                "ps",
                "Palestine (‫فلسطين‬‎)",
                970
            )
        )
        COUNTRIES.add(
            Country(
                "pa",
                "Panama (Panamá)",
                507
            )
        )
        COUNTRIES.add(
            Country(
                "pg",
                "Papua New Guinea",
                675
            )
        )
        COUNTRIES.add(
            Country(
                "py",
                "Paraguay",
                595
            )
        )
        COUNTRIES.add(
            Country(
                "pe",
                "Peru (Perú)",
                51
            )
        )
        COUNTRIES.add(
            Country(
                "ph",
                "Philippines",
                63
            )
        )
        COUNTRIES.add(
            Country(
                "pl",
                "Poland (Polska)",
                48
            )
        )
        COUNTRIES.add(
            Country(
                "pt",
                "Portugal",
                351
            )
        )
        COUNTRIES.add(
            Country(
                "pr",
                "Puerto Rico",
                1
            )
        )
        COUNTRIES.add(
            Country(
                "qa",
                "Qatar (‫قطر‬‎)",
                974
            )
        )
        COUNTRIES.add(
            Country(
                "re",
                "Réunion (La Réunion)",
                262
            )
        )
        COUNTRIES.add(
            Country(
                "ro",
                "Romania (România)",
                40
            )
        )
        COUNTRIES.add(
            Country(
                "ru",
                "Russia (Россия)",
                7
            )
        )
        COUNTRIES.add(
            Country(
                "rw",
                "Rwanda",
                250
            )
        )
        COUNTRIES.add(
            Country(
                "bl",
                "Saint Barthélemy (Saint-Barthélemy)",
                590
            )
        )
        COUNTRIES.add(
            Country(
                "sh",
                "Saint Helena",
                290
            )
        )
        COUNTRIES.add(
            Country(
                "kn",
                "Saint Kitts and Nevis",
                1869
            )
        )
        COUNTRIES.add(
            Country(
                "lc",
                "Saint Lucia",
                1758
            )
        )
        COUNTRIES.add(
            Country(
                "mf",
                "Saint Martin (Saint-Martin (partie française))",
                590
            )
        )
        COUNTRIES.add(
            Country(
                "pm",
                "Saint Pierre and Miquelon (Saint-Pierre-et-Miquelon)",
                508
            )
        )
        COUNTRIES.add(
            Country(
                "vc",
                "Saint Vincent and the Grenadines",
                1784
            )
        )
        COUNTRIES.add(
            Country(
                "ws",
                "Samoa",
                685
            )
        )
        COUNTRIES.add(
            Country(
                "sm",
                "San Marino",
                378
            )
        )
        COUNTRIES.add(
            Country(
                "st",
                "São Tomé and Príncipe (São Tomé e Príncipe)",
                239
            )
        )
        COUNTRIES.add(
            Country(
                "sa",
                "Saudi Arabia (‫المملكة العربية السعودية‬‎)",
                966
            )
        )
        COUNTRIES.add(
            Country(
                "sn",
                "Senegal (Sénégal)",
                221
            )
        )
        COUNTRIES.add(
            Country(
                "rs",
                "Serbia (Србија)",
                381
            )
        )
        COUNTRIES.add(
            Country(
                "sc",
                "Seychelles",
                248
            )
        )
        COUNTRIES.add(
            Country(
                "sl",
                "Sierra Leone",
                232
            )
        )
        COUNTRIES.add(
            Country(
                "sg",
                "Singapore",
                65
            )
        )
        COUNTRIES.add(
            Country(
                "sx",
                "Sint Maarten",
                1721
            )
        )
        COUNTRIES.add(
            Country(
                "sk",
                "Slovakia (Slovensko)",
                421
            )
        )
        COUNTRIES.add(
            Country(
                "si",
                "Slovenia (Slovenija)",
                386
            )
        )
        COUNTRIES.add(
            Country(
                "sb",
                "Solomon Islands",
                677
            )
        )
        COUNTRIES.add(
            Country(
                "so",
                "Somalia (Soomaaliya)",
                252
            )
        )
        COUNTRIES.add(
            Country(
                "za",
                "South Africa",
                27
            )
        )

        COUNTRIES.add(
            Country(
                "ss",
                "South Sudan (‫جنوب السودان‬‎)",
                211
            )
        )
        COUNTRIES.add(
            Country(
                "es",
                "Spain (España)",
                34
            )
        )
        COUNTRIES.add(
            Country(
                "lk",
                "Sri Lanka (ශ්‍රී ලංකාව)",
                94
            )
        )
        COUNTRIES.add(
            Country(
                "sd",
                "Sudan (‫السودان‬‎)",
                249
            )
        )
        COUNTRIES.add(
            Country(
                "sr",
                "Suriname",
                597
            )
        )
        COUNTRIES.add(
            Country(
                "sj",
                "Svalbard and Jan Mayen",
                47
            )
        )
        COUNTRIES.add(
            Country(
                "sz",
                "Swaziland",
                268
            )
        )
        COUNTRIES.add(
            Country(
                "se",
                "Sweden (Sverige)",
                46
            )
        )
        COUNTRIES.add(
            Country(
                "ch",
                "Switzerland (Schweiz)",
                41
            )
        )
        COUNTRIES.add(
            Country(
                "sy",
                "Syria (‫سوريا‬‎)",
                963
            )
        )
        COUNTRIES.add(
            Country(
                "tw",
                "Taiwan (台灣)",
                886
            )
        )
        COUNTRIES.add(
            Country(
                "tj",
                "Tajikistan",
                992
            )
        )
        COUNTRIES.add(
            Country(
                "tz",
                "Tanzania",
                255
            )
        )
        COUNTRIES.add(
            Country(
                "tl",
                "Timor-Leste",
                670
            )
        )
        COUNTRIES.add(
            Country(
                "tg",
                "Togo",
                228
            )
        )
        COUNTRIES.add(
            Country(
                "tk",
                "Tokelau",
                690
            )
        )
        COUNTRIES.add(
            Country(
                "to",
                "Tonga",
                676
            )
        )
        COUNTRIES.add(
            Country(
                "tt",
                "Trinidad and Tobago",
                1868
            )
        )
        COUNTRIES.add(
            Country(
                "tn",
                "Tunisia (‫تونس‬‎)",
                216
            )
        )
        COUNTRIES.add(
            Country(
                "tr",
                "Turkey (Türkiye)",
                90
            )
        )
        COUNTRIES.add(
            Country(
                "tm",
                "Turkmenistan",
                993
            )
        )
        COUNTRIES.add(
            Country(
                "tc",
                "Turks and Caicos Islands",
                1649
            )
        )
        COUNTRIES.add(
            Country(
                "tv",
                "Tuvalu",
                688
            )
        )
        COUNTRIES.add(
            Country(
                "vi",
                "U.S. Virgin Islands",
                1340
            )
        )
        COUNTRIES.add(
            Country(
                "ug",
                "Uganda",
                256
            )
        )
        COUNTRIES.add(
            Country(
                "ua",
                "Ukraine (Україна)",
                380
            )
        )
        COUNTRIES.add(
            Country(
                "ae",
                "United Arab Emirates (‫الإمارات العربية المتحدة‬‎)",
                971
            )
        )
        COUNTRIES.add(
            Country(
                "gb",
                "United Kingdom",
                44
            )
        )
        COUNTRIES.add(
            Country(
                "us",
                "United States",
                1
            )
        )
        COUNTRIES.add(
            Country(
                "uy",
                "Uruguay",
                598
            )
        )
        COUNTRIES.add(
            Country(
                "uz",
                "Uzbekistan (Oʻzbekiston)",
                998
            )
        )
        COUNTRIES.add(
            Country(
                "vu",
                "Vanuatu",
                678
            )
        )
        COUNTRIES.add(
            Country(
                "va",
                "Vatican City (Città del Vaticano)",
                39
            )
        )
        COUNTRIES.add(
            Country(
                "ve",
                "Venezuela",
                58
            )
        )

        COUNTRIES.add(
            Country(
                "wf",
                "Wallis and Futuna",
                681
            )
        )
        COUNTRIES.add(
            Country(
                "eh",
                "Western Sahara (‫الصحراء الغربية‬‎)",
                212
            )
        )
        COUNTRIES.add(
            Country(
                "ye",
                "Yemen (‫اليمن‬‎)",
                967
            )
        )
        COUNTRIES.add(
            Country(
                "zm",
                "Zambia",
                260
            )
        )
        COUNTRIES.add(
            Country(
                "zw",
                "Zimbabwe",
                263
            )
        )
        COUNTRIES.add(
            Country(
                "ax",
                "Åland Islands",
                358
            )
        )
    }
}