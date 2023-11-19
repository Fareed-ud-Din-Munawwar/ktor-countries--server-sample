package com.example.routes

import com.example.data.Constants.BASE_URL
import com.example.data.Country
import com.example.data.CountryDetailed
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

private val countries = listOf(
    CountryDetailed(1,"$BASE_URL/flags/Flag_of_Argentina.png","Argentina", "9-July-1816","Argentina, officially the Argentine Republic, is a country in the southern half of South America. Argentina covers an area of 2,780,400 km², making it the second-largest country in South America after Brazil, the fourth-largest country in the Americas, and the eighth-largest country in the world.","Argentina (Spanish pronunciation: [aɾxenˈtina] ⓘ), officially the Argentine Republic[A] (Spanish: República Argentina), is a country in the southern half of South America. Argentina covers an area of 2,780,400 km2 (1,073,500 sq mi),[B] making it the second-largest country in South America after Brazil, the fourth-largest country in the Americas, and the eighth-largest country in the world. It shares the bulk of the Southern Cone with Chile to the west, and is also bordered by Bolivia and Paraguay to the north, Brazil to the northeast, Uruguay and the South Atlantic Ocean to the east, and the Drake Passage to the south. Argentina is a federal state subdivided into twenty-three provinces, and one autonomous city, which is the federal capital and largest city of the nation, Buenos Aires. The provinces and the capital have their own constitutions, but exist under a federal system. Argentina claims sovereignty over the Falkland Islands, South Georgia and the South Sandwich Islands, the Southern Patagonian Ice Field, and a part of Antarctica.\n" +
            "\n" +
            "The earliest recorded human presence in modern-day Argentina dates back to the Paleolithic period.[14] The Inca Empire expanded to the northwest of the country in Pre-Columbian times. The country has its roots in Spanish colonization of the region during the 16th century.[15] Argentina rose as the successor state of the Viceroyalty of the Río de la Plata,[16] a Spanish overseas viceroyalty founded in 1776. The declaration and fight for independence (1810–1818) was followed by an extended civil war that lasted until 1861, culminating in the country's reorganization as a federation. The country thereafter enjoyed relative peace and stability, with several waves of European immigration, mainly Italians and Spaniards, influencing its culture and demography.[17][18][19][20]\n" +
            "\n" +
            "The almost-unparalleled increase in prosperity led to Argentina becoming the seventh-wealthiest nation in the world by the early 20th century.[21][22][23] In 1896, Argentina's GDP per capita surpassed that of the United States,[24] and was consistently in the top ten before at least 1920;[25][26] Argentina remained among the fifteen richest countries for several decades.[21] Following the Great Depression in the 1930s, the country descended into political instability and economic decline that pushed it back into underdevelopment,[27] being currently ranked 62nd in the world. Following the death of President Juan Perón in 1974, his widow and vice president, Isabel Perón, ascended to the presidency, before being overthrown in 1976. The following military junta, which was supported by the United States, persecuted and murdered thousands of political critics, activists, and leftists in the Dirty War, a period of state terrorism and civil unrest that lasted until the election of Raúl Alfonsín as president in 1983.\n" +
            "\n" +
            "Argentina is a regional power, and retains its historic status as a middle power in international affairs.[28][29][30] A major non-NATO ally of the United States,[31] Argentina is a developing country with the second-highest HDI (human development index) in Latin America after Chile.[32] It maintains the second-largest economy in South America, and is a member of G-15 and G20. Argentina is also a founding member of the United Nations, World Bank, World Trade Organization, Mercosur, Community of Latin American and Caribbean States and the Organization of Ibero-American States. It is expected to join BRICS on 1 January 2024.[33]"),
    CountryDetailed(2,"$BASE_URL/flags/Flag_of_Australia.png", "Australia", "3-September-1939","Australia, officially the Commonwealth of Australia, is a sovereign country comprising the mainland of the Australian continent, the island of Tasmania, and numerous smaller islands. Australia is the largest country by area in Oceania and the world's sixth-largest country.","Australia, officially the Commonwealth of Australia,[17] is a sovereign country comprising the mainland of the Australian continent, the island of Tasmania, and numerous smaller islands.[18] Australia is the largest country by area in Oceania and the world's sixth-largest country. Australia is the oldest,[19] flattest,[20] and driest inhabited continent,[21][22] with the least fertile soils.[23][24] It is a megadiverse country, and its size gives it a wide variety of landscapes and climates, with deserts in the centre, tropical rainforests in the north-east, tropical savannas in the north, and mountain ranges in the south-east.\n" +
            "\n" +
            "The ancestors of Aboriginal Australians began arriving from south-east Asia 50,000 to 65,000 years ago, during the last ice age.[25][26][27] Arriving by sea, they settled the continent and had formed approximately 250 distinct language groups by the time of European settlement, maintaining some of the longest known continuing artistic and religious traditions in the world.[28] Australia's written history commenced with the European maritime exploration of Australia. The Dutch navigator Willem Janszoon was the first known European to reach Australia, in 1606. In 1770, the British explorer James Cook mapped and claimed the east coast of Australia for Great Britain, and the First Fleet of British ships arrived at Sydney in 1788 to establish the penal colony of New South Wales. The European population grew in subsequent decades, and by the end of the 1850s gold rush, most of the continent had been explored by European settlers and an additional five self-governing British colonies established. Democratic parliaments were gradually established through the 19th century, culminating with a vote for the federation of the six colonies and foundation of the Commonwealth of Australia on 1 January 1901.[29] This began a process of increasing autonomy from the United Kingdom, highlighted by the Statute of Westminster Adoption Act 1942, and culminating in the Australia Act 1986.[29]\n" +
            "\n" +
            "Australia is a federal parliamentary constitutional monarchy, comprising six states and ten territories. Australia's population of nearly 27 million[11] is highly urbanised and heavily concentrated on the eastern seaboard.[30] Canberra is the nation's capital, while its most populous city and financial centre is Sydney.[31] The next four largest cities are Melbourne, Brisbane, Perth, and Adelaide. It is ethnically diverse and multicultural, the product of large-scale immigration, with almost half of the population having at least one parent born overseas.[32] Australia's abundant natural resources and well-developed international trade relations are crucial to the country's economy, which generates its income from various sources including services, mining exports, banking, manufacturing, agriculture and international education.[33][34][35] Australia ranks highly for quality of life, health, education, economic freedom, civil liberties and political rights.[36]\n" +
            "\n" +
            "Australia has a highly developed market economy and one of the highest per capita incomes globally.[37][38] Australia is a regional power, and has the world's thirteenth-highest military expenditure.[39] It is a member of international groupings including the United Nations; the G20; the OECD; the World Trade Organization; Asia-Pacific Economic Cooperation; the Pacific Islands Forum; the Pacific Community; the Commonwealth of Nations; and the defence/security organisations ANZUS, AUKUS, and the Five Eyes. It is a major non-NATO ally of the United States.[40]"),
    CountryDetailed(3,"$BASE_URL/flags/Flag_of_Brazil.png","Brazil","7-September-1822","Brazil, officially the Federative Republic of Brazil, is the largest country in South America and in Latin America. Brazil is the world's fifth-largest country by area and the seventh most populous. Its capital is Brasília, and its most populous city is São Paulo.","Brazil (Portuguese: Brasil; Brazilian Portuguese: [bɾaˈziw] ⓘ), officially the Federative Republic of Brazil (Portuguese: República Federativa do Brasilⓘ),[9] is the largest country in South America and in Latin America. Brazil is the world's fifth-largest country by area and the seventh most populous. Its capital is Brasília, and its most populous city is São Paulo. The federation is composed of the union of the 26 states and the Federal District. It is the only country in the Americas to have Portuguese as an official language.[10][11] It is one of the most multicultural and ethnically diverse nations, due to over a century of mass immigration from around the world,[12] and the most populous Roman Catholic-majority country.\n" +
            "\n" +
            "Bounded by the Atlantic Ocean on the east, Brazil has a coastline of 7,491 kilometers (4,655 mi).[13] It borders all other countries and territories in South America except Ecuador and Chile and covers roughly half of the continent's land area.[14] Its Amazon basin includes a vast tropical forest, home to diverse wildlife, a variety of ecological systems, and extensive natural resources spanning numerous protected habitats.[13] This unique environmental heritage positions Brazil at number one of 17 megadiverse countries, and is the subject of significant global interest, as environmental degradation through processes like deforestation has direct impacts on global issues like climate change and biodiversity loss.\n" +
            "\n" +
            "The territory which would become known as Brazil was inhabited by numerous tribal nations prior to the landing in 1500 of explorer Pedro Álvares Cabral, who claimed the discovered land for the Portuguese Empire. Brazil remained a Portuguese colony until 1808 when the capital of the empire was transferred from Lisbon to Rio de Janeiro. In 1815, the colony was elevated to the rank of kingdom upon the formation of the United Kingdom of Portugal, Brazil and the Algarves. Independence was achieved in 1822 with the creation of the Empire of Brazil, a unitary state governed under a constitutional monarchy and a parliamentary system. The ratification of the first constitution in 1824 led to the formation of a bicameral legislature, now called the National Congress. Slavery was abolished in 1888. The country became a presidential republic in 1889 following a military coup d'état. An authoritarian military dictatorship emerged in 1964 and ruled until 1985, after which civilian governance resumed. Brazil's current constitution, formulated in 1988, defines it as a democratic federal republic.[15] Due to its rich culture and history, the country ranks thirteenth in the world by number of UNESCO World Heritage Sites.[16]\n" +
            "\n" +
            "Brazil is a regional and middle power[17][18][19] and is also classified as an emerging power and a major non-NATO ally.[20][21][22][23][24] Categorised as a developing country with a high Human Development Index,[25] Brazil is considered an advanced emerging economy,[26] having the ninth largest GDP in the world by nominal, and eighth by PPP measures, the largest in Latin America.[6][27] As an upper-middle income economy by the World Bank[28] and a newly industrialized country,[29] Brazil has the largest share of global wealth in South America and it is one of the world's major breadbaskets, being the largest producer of coffee for the last 150 years.[30] However, the country retains noticeable corruption, crime and social inequality. Brazil is a founding member of the United Nations, the G20, BRICS, G4, Mercosul, Organization of American States, Organization of Ibero-American States and the Community of Portuguese Language Countries. Brazil is also an Observer State of the Arab League.[31]"),
    CountryDetailed(4,"$BASE_URL/flags/Flag_of_Canada.png","Canada","17-April-1982","Canada is a country in North America. Its ten provinces and three territories extend from the Atlantic Ocean to the Pacific Ocean and northward into the Arctic Ocean, making it the world's second-largest country by total area, with the world's longest coastline. ", "Canada is a country in North America. Its ten provinces and three territories extend from the Atlantic Ocean to the Pacific Ocean and northward into the Arctic Ocean, making it the world's second-largest country by total area, with the world's longest coastline. Its border with the United States is the world's longest international land border. The country is characterized by a wide range of both meteorologic and geological regions. It is a sparsely inhabited country of 40 million people, the vast majority residing south of the 55th parallel in urban areas. Canada's capital is Ottawa and its three largest metropolitan areas are Toronto, Montreal, and Vancouver.\n" +
            "\n" +
            "Indigenous peoples have continuously inhabited what is now Canada for thousands of years. Beginning in the 16th century, British and French expeditions explored and later settled along the Atlantic coast. As a consequence of various armed conflicts, France ceded nearly all of its colonies in North America in 1763. In 1867, with the union of three British North American colonies through Confederation, Canada was formed as a federal dominion of four provinces. This began an accretion of provinces and territories and a process of increasing autonomy from the United Kingdom, highlighted by the Statute of Westminster, 1931, and culminating in the Canada Act 1982, which severed the vestiges of legal dependence on the Parliament of the United Kingdom.\n" +
            "\n" +
            "Canada is a parliamentary democracy and a constitutional monarchy in the Westminster tradition. The country's head of government is the prime minister, who holds office by virtue of their ability to command the confidence of the elected House of Commons and is \"called upon\" by the governor general, representing the monarch of Canada, the head of state. The country is a Commonwealth realm and is officially bilingual (English and French) in the federal jurisdiction. It is very highly ranked in international measurements of government transparency, quality of life, economic competitiveness, innovation, education and gender equality. It is one of the world's most ethnically diverse and multicultural nations, the product of large-scale immigration. Canada's long and complex relationship with the United States has had a significant impact on its history, economy, and culture.\n" +
            "\n" +
            "A developed country, Canada has a high nominal per capita income globally and its advanced economy ranks among the largest in the world, relying chiefly upon its abundant natural resources and well-developed international trade networks. Canada is recognized as a middle power for its role in international affairs, with a tendency to pursue multilateral solutions. Canada's peacekeeping role during the 20th century has had a significant influence on its global image. Canada is part of multiple major international and intergovernmental institutions."),
    CountryDetailed(5,"$BASE_URL/flags/Flag_of_Denmark.png","Denmark","5-May-1945","Denmark is a Scandinavian country comprising the Jutland Peninsula and numerous islands. It's linked to nearby Sweden via the Öresund bridge. Copenhagen, its capital, is home to royal palaces and colorful Nyhavn harbor, plus the Tivoli amusement park and the iconic “Little Mermaid” statue. Odense is writer Hans Christian Andersen’s hometown, with a medieval core of cobbled streets and half-timbered houses. ","Denmark (Danish: Danmark, pronounced [ˈtænmɑk] ⓘ) is a Nordic country in Northern Europe. It is the metropolitan part of and the most populous constituent of the Kingdom of Denmark,[N 9] a constitutionally unitary state that includes the autonomous territories of the Faroe Islands and Greenland in the North Atlantic Ocean.[15] Metropolitan Denmark[N 10] is the southernmost of the Scandinavian countries, lying south-west and south (Bornholm and Ertholmene) of Sweden, south of Norway,[N 11] and north of Germany, with which it shares a short border, Denmark's only land border.\n" +
            "\n" +
            "As of 2013, the Kingdom of Denmark, including the Faroe Islands and Greenland, had a total of 1,419 islands above 100 square metres (1,100 sq ft); 443 of these have been named and 78 are inhabited.[16] Spanning a total area of 42,943 km2 (16,580 sq mi),[9] metropolitan Denmark consists of the northern part of the Jutland peninsula and an archipelago of 406 islands.[17] Of these, the most populated island is Zealand, on which the capital and largest city, Copenhagen, is situated, followed by Funen, the North Jutlandic Island, and Amager.[18] Denmark has flat, arable land, sandy coasts, low elevations, and a temperate climate. It had a population of 5.935 million (1 February 2023), of whom 800,000 live in Copenhagen (2 million in the wider area).[19] Denmark exercises hegemonic influence in the Danish Realm, devolving powers to handle internal affairs. Home rule was established in the Faroe Islands in 1948 and in Greenland in 1979; the latter obtained further autonomy in 2009.\n" +
            "\n" +
            "The unified Kingdom of Denmark emerged in the 8th century AD as a proficient maritime power amid the struggle for control of the Baltic Sea.[3] In 1397, it joined Norway and Sweden to form the Kalmar Union, which persisted until the latter's secession in 1523. The remaining Kingdom of Denmark–Norway endured a series of wars in the 17th century that resulted in further territorial cessions. A surge of nationalist movements in the 19th century were defeated in the First Schleswig War of 1848. The adoption of the Constitution of Denmark on 5 June 1849 ended the absolute monarchy and introduced the current parliamentary system. An industrialised exporter of agricultural produce in the second half of the 19th century, Denmark introduced social and labour-market reforms in the early 20th century, which formed the basis for the present welfare state model and advanced mixed economy. Denmark remained neutral during World War I; Danish neutrality was violated in World War II by a swift German invasion in April 1940. During occupation, a resistance movement emerged in 1943, while Iceland declared independence in 1944; Denmark was liberated in May 1945. In 1973, Denmark, together with Greenland but not the Faroe Islands, became a member of what is now the European Union, but negotiated certain opt-outs, such as retaining its own currency, the krone.\n" +
            "\n" +
            "Denmark is a developed country with a high standard of living. Denmark is a founding member of NATO, the Nordic Council, the OECD, the OSCE, and the United Nations; it is also part of the Schengen Area. Denmark maintains close political, cultural, and linguistic ties with its Scandinavian neighbours, with the Danish language being partially mutually intelligible with both Norwegian and Swedish."),
    CountryDetailed(6,"$BASE_URL/flags/Flag_of_England.png","England", "-","England is a country that is part of the United Kingdom. It shares land borders with Wales to its west and Scotland to its north, while Ireland is located across the Irish Sea to its west and northwest, and the Celtic Sea lies to its southwest.","England is a country that is part of the United Kingdom.[6] It shares land borders with Wales to its west and Scotland to its north, while Ireland is located across the Irish Sea to its west and northwest, and the Celtic Sea lies to its southwest. It is separated from continental Europe by the North Sea to the east and the English Channel to the south. The country covers roughly 62% of the island of Great Britain, which is in the North Atlantic, and includes over 100 smaller islands such as the Isles of Scilly and the Isle of Wight.\n" +
            "\n" +
            "The area now called England was first inhabited by modern humans during the Upper Paleolithic, but takes its name from the Angles, a Germanic tribe who settled during the 5th and 6th centuries. England became a unified state in the 10th century and has had a significant cultural and legal impact on the wider world since the Age of Discovery, which began during the 15th century.[7] The Kingdom of England, which included Wales after 1535, ceased being a separate sovereign state on 1 May 1707 when the Acts of Union put the terms agreed in the Treaty of Union the previous year into effect; this resulted in a political union with the Kingdom of Scotland that created the Kingdom of Great Britain.[8]\n" +
            "\n" +
            "England is the origin of many well-known worldwide exports, including the English language, the English law system (which served as the basis for the common law systems of many other countries), association football (the world's most popular sport), and the Church of England; its parliamentary system of government has been widely adopted by other nations.[9] The Industrial Revolution began in 18th-century England, transforming its society into the world's first industrialised nation.[10] England is home to the two oldest universities in the English-speaking world: the University of Oxford, founded in 1096, and the University of Cambridge, founded in 1209. Both universities are ranked among the most prestigious in the world.[11][12]\n" +
            "\n" +
            "England's terrain chiefly consists of low hills and plains, especially in the centre and south. Upland and mountainous terrain is mostly found in the north and west, including Dartmoor, the Lake District, the Pennines, and the Shropshire Hills. The country's capital is London, the greater metropolitan of which has a population of 14.2 million as of 2021, representing the United Kingdom's largest metropolitan area. England's population of 56.3 million comprises 84% of the population of the United Kingdom,[13] largely concentrated around London, the southeast, and conurbations in the centre, the northwest, the northeast, and Yorkshire, which each developed as major industrial regions during the 19th century."),
    CountryDetailed(7,"$BASE_URL/flags/Flag_of_Kuwait.png","Kuwait","19-June-1961","Kuwait, officially the State of Kuwait, is a country in the Middle East. It is situated in the northern edge of Eastern Arabia at the tip of the Persian Gulf, bordering Iraq to the north and Saudi Arabia to the south. Kuwait also shares maritime borders with Iran. Kuwait has a coastal length of approximately 500 km.","Kuwait (/kʊˈweɪt/ ⓘ;[7][8] Arabic: الكويت al-Kuwayt, Gulf Arabic pronunciation: [ɪl‿ɪkweːt] or [lɪkweːt]), officially the State of Kuwait (Arabic: دولة الكويت Dawlat al-Kuwaytⓘ), is a country in the Middle East. It is situated in the northern edge of Eastern Arabia at the tip of the Persian Gulf, bordering Iraq to the north and Saudi Arabia to the south.[9] Kuwait also shares maritime borders with Iran. Kuwait has a coastal length of approximately 500 km (311 mi).[10] Most of the country's population reside in the urban agglomeration of the capital and largest city Kuwait City.[11] As of 2022, Kuwait has a population of 4.45 million people of which 1.45 million are Kuwaiti citizens while the remaining 3.00 million are foreign nationals from over 100 countries.\n" +
            "\n" +
            "Historically, most of present-day Kuwait was part of ancient Mesopotamia.[12][13][14] Before the discovery of oil, Kuwait was a strategic trade port between Mesopotamia, Persia and India. Oil reserves were discovered in commercial quantities in 1938. In 1946, crude oil was exported for the first time.[15][16] From 1946 to 1982, the country underwent large-scale modernization, largely based on income from oil production. In the 1980s, Kuwait experienced a period of geopolitical instability and an economic crisis following the stock market crash. In 1990, after oil production disputes with neighbouring Iraq, Kuwait was invaded, and later annexed into one of Iraq's governorates by Iraq under Saddam Hussein.[17] The Iraqi occupation of Kuwait came to an end on February 26, 1991, after military intervention by a military coalition led by the United States and various other countries.\n" +
            "\n" +
            "As an Arab state in the Persian Gulf, Kuwait is an emirate. The emir is the head of state and the Al Sabah is the ruling family which dominates the country's political system. Kuwait's official state religion is Islam, specifically the Maliki school of Sunni Islam. Kuwait is a developing country with a high-income economy, backed by the world's sixth largest oil reserves. Kuwaiti popular culture, in the form of theatre, radio, music, and television soap opera, is regionally influential and exported to neighboring GCC states.[18] In 2009, Kuwait had the highest Human Development Index in the Arab world.[19][20] Kuwait is a founding member of the GCC and is also a member of the UN, AL, OPEC and the OIC. In July 2022, Kuwait named the emir's son as the country's new prime minister to replace caretaker premier Sheikh Sabah al-Khalid, who faced a combative parliament as head of cabinet in a feud hindering fiscal reform."),
    CountryDetailed(8, "$BASE_URL/flags/Flag_of_Pakistan.png","Pakistan","14-August-1947","Pakistan, officially the Islamic Republic of Pakistan, is a country in South Asia. It is the world's fifth-most populous country, with a population of 241.5 million people, and has the world's largest Muslim population as of 2023.","Pakistan (Urdu: پَاکِسْتَان [ˈpaːkɪstaːn]),[d] officially the Islamic Republic of Pakistan (ISO: اِسْلامی جَمْہُورِیَہ پَاکِسْتَان, islāmi jamhūriyāh pākistān), is a country in South Asia. It is the world's fifth-most populous country, with a population of 241.5 million people, and has the world's largest Muslim population as of 2023.[10] Islamabad is the nation's capital, while Karachi is its largest city and financial centre, followed by Lahore and Faisalabad. Pakistan is the 33rd-largest country in the world by area and the second largest in South Asia, spanning 881,913 square kilometres (340,509 square miles). It has a 1,046-kilometre (650-mile) coastline along the Arabian Sea and Gulf of Oman in the south, and is bordered by India to the east, Afghanistan to the west, Iran to the southwest, and China to the northeast. It is separated from Tajikistan by Afghanistan's narrow Wakhan Corridor in the north, and also shares a maritime border with Oman.\n" +
            "\n" +
            "Pakistan is the site of several ancient cultures, including the 8,500-year-old Neolithic site of Mehrgarh in Balochistan,[15] the Indus Valley civilisation of the Bronze Age,[16][17] and the ancient Gandhara civilisation.[18] The regions that comprise the modern state of Pakistan were the realm of multiple empires and dynasties, including the Achaemenid, the Maurya, the Kushan, the Gupta;[19] the Umayyad Caliphate in its southern regions, the Samma, the Hindu Shahis, the Shah Miris, the Ghaznavids, the Delhi Sultanate, the Mughals,[20] and most recently, the British Raj from 1858 to 1947.\n" +
            "\n" +
            "Spurred by the Pakistan Movement, which sought a homeland for the Muslims of British India, and election victories in 1946 by the All-India Muslim League, Pakistan gained independence in 1947 after the Partition of the British Indian Empire, which awarded separate statehood to its Muslim-majority regions and was accompanied by an unparalleled mass migration and loss of life.[21] Initially a Dominion of the British Commonwealth, Pakistan officially drafted its constitution in 1956, and emerged as a declared Islamic republic. In 1971, the exclave of East Pakistan seceded as the new country of Bangladesh after a nine-month-long civil war. In the following four decades, Pakistan has been ruled by governments whose descriptions, although complex, commonly alternated between civilian and military, democratic and authoritarian, relatively secular and Islamist.[22] Pakistan elected a civilian government in 2008, and in 2010 adopted a parliamentary system with periodic elections.[23]\n" +
            "\n" +
            "Pakistan is a middle power nation,[24][25][26][27][28][29] and has the world's sixth-largest standing armed forces. It is a declared nuclear-weapons state, and is ranked amongst the emerging and growth-leading economies,[30] with a large and rapidly-growing middle class.[31] Pakistan's political history since independence has been characterised by periods of significant economic and military growth as well as those of political and economic instability. It is an ethnically and linguistically diverse country, with similarly diverse geography and wildlife. The country continues to face challenges, including poverty, illiteracy, corruption and terrorism.[32] Pakistan is a member of the United Nations, the Shanghai Cooperation Organisation, the Organisation of Islamic Cooperation, the Commonwealth of Nations, the South Asian Association for Regional Cooperation, and the Islamic Military Counter-Terrorism Coalition, and is designated as a major non-NATO ally by the United States.")
)

fun Route.getListOfCountries(){
    get("/"){
        call.respond(
            HttpStatusCode.OK,
            countries.map { Country(it.id,it.imageUrl,it.name, it.smallDescription) }
        )
    }
    get("/country"){
        val id = call.parameters["countryId"]
        val result = countries.find { it.id.toString() == id }
        if (result != null) {
            call.respond(
                HttpStatusCode.OK,
                result
                )
        }
        else {
            call.respond(
                HttpStatusCode.BadRequest,
                "Illegal Id found in the request"
            )
        }
    }
}

fun Route.getRandomCountry(){
    get("/randomCountry"){
        call.respond(
            HttpStatusCode.OK,
            countries.map { Country(it.id,it.imageUrl,it.name, it.smallDescription) }.random()
        )
    }
}