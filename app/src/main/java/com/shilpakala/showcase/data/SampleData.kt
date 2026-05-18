package com.shilpakala.showcase.data

object SampleData {
    fun getSculptures(): List<Sculpture> = listOf(
        Sculpture(
            id = "SKS-001",
            name = "Nataraja - Dancing Shiva",
            shilpiName = "Master Ramaiah B.",
            style = "Hoysala",
            material = "Black Granite",
            price = "₹85,000",
            imageUrls = listOf(
                "https://upload.wikimedia.org/wikipedia/commons/thumb/b/bf/Shiva_as_the_Lord_of_Dance_LACMA_edit.jpg/250px-Shiva_as_the_Lord_of_Dance_LACMA_edit.jpg",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTcOjqjjjnRuOnLZ5PBWQ7et3FYE8aoR1yeFw&s"
            ),
            timelineImages = listOf(
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTcOjqjjjnRuOnLZ5PBWQ7et3FYE8aoR1yeFw&s"
            ),
            description = "A masterpiece carved over 6 months from a single block of black granite. Every detail follows ancient Shilpa Shastra proportions passed down for 1000 years.",
            isAvailable = true
        ),
        Sculpture(
            id = "SKS-002",
            name = "Ganesha - Remover of Obstacles",
            shilpiName = "Shilpi Venkatesh K.",
            style = "Dravidian",
            material = "Soapstone",
            price = "₹42,000",
            imageUrls = listOf(
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTevt6Y5OoT4WfCg6oNelkyjU29MlbDtveMLg&s",
                "https://cdn.exoticindia.com/images/products/original/sculptures-2019/miv462.jpg"
            ),
            timelineImages = listOf(
                "https://cdn.exoticindia.com/images/products/original/sculptures-2019/miv462.jpg"
            ),
            description = "Seated Ganesha in Dravidian style with elaborate crown and four arms. Carved from Nanjangud soapstone known for fine grain and intricate detailing.",
            isAvailable = true
        ),
        Sculpture(
            id = "SKS-003",
            name = "Lakshmi - Goddess of Prosperity",
            shilpiName = "Master Ramaiah B.",
            style = "Hoysala",
            material = "Black Granite",
            price = "₹1,10,000",
            imageUrls = listOf(
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTivSsu8UvCJ2wCJrlKaPgJWa9Zl-WA32xQCg&s",
                "https://cdn.thestonestudio.in/wp-content/uploads/2024/06/Maa-Lakshmi-Devi-stone-statue.jpg"
            ),
            timelineImages = listOf(
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTivSsu8UvCJ2wCJrlKaPgJWa9Zl-WA32xQCg&s"
            ),
            description = "Standing Lakshmi with lotus and pot of gold in classic Hoysala style with intricate jewelry carvings. The star-shaped base is signature Hoysala craftsmanship.",
            isAvailable = false
        ),
        Sculpture(
            id = "SKS-004",
            name = "Nandi - Sacred Bull of Shiva",
            shilpiName = "Shilpi Krishnamurthy",
            style = "Vijayanagara",
            material = "Granite",
            price = "₹65,000",
            imageUrls = listOf(
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQIOezQEL_JzeaAmcrwkDgy2Ry_P8N8jGK8cg&s",
                "https://m.media-amazon.com/images/I/81T7TjFirWL.jpg"
            ),
            timelineImages = listOf(
                "https://m.media-amazon.com/images/I/81T7TjFirWL.jpg"
            ),
            description = "Reclining Nandi in Vijayanagara style. The muscular form, decorative collar with bells, and peaceful expression are hallmarks of this tradition.",
            isAvailable = true
        ),
        Sculpture(
            id = "SKS-005",
            name = "Saraswati - Goddess of Arts",
            shilpiName = "Shilpi Venkatesh K.",
            style = "Chalukya",
            material = "Sandstone",
            price = "₹78,000",
            imageUrls = listOf(
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRnQbaZSWh57TMWtoijBIe7-oJxA9WeDU8Avw&s",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTjJmoPaC_1h8K9PKNYprq_vJYmQ4m9-60WIA&s"
            ),
            timelineImages = listOf(
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRnQbaZSWh57TMWtoijBIe7-oJxA9WeDU8Avw&s"
            ),
            description = "Four-armed Saraswati playing the Veena in Chalukyan style. Flowing garments and serene expression carved with exceptional finesse from Karnataka sandstone.",
            isAvailable = true
        ),
        Sculpture(
            id = "SKS-006",
            name = "Mahishasura Mardini - Durga",
            shilpiName = "Master Ramaiah B.",
            style = "Hoysala",
            material = "Black Granite",
            price = "₹1,45,000",
            imageUrls = listOf(
                "https://cdn.thestonestudio.in/wp-content/uploads/2023/11/Goddess-Durga-maa-sculpture.jpg",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTNYZp4NfUvwuCB7sskZPo22OqCTOyGWaCYsw&s"
            ),
            timelineImages = listOf(
                "https://m.media-amazon.com/images/I/71EatoWttzL._AC_UF350,350_QL80_.jpg"
            ),
            description = "Ten-armed Durga slaying Mahishasura. This monumental piece took 9 months to complete. Each weapon in her hands is carved from the same single granite block.",
            isAvailable = true
        ),
        Sculpture(
            id = "SKS-007",
            name = "Hanuman - The Devoted",
            shilpiName = "Shilpi Nagaraj S.",
            style = "Vijayanagara",
            material = "Granite",
            price = "₹55,000",
            imageUrls = listOf(
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQfNskUUwMl4n5uIU_yVRsDbsO3RUqYNnCYhA&s",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSIgqjx1M8Al-12310v-SETzFXT3-hGfjO1uA&s"
            ),
            timelineImages = listOf(
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQfNskUUwMl4n5uIU_yVRsDbsO3RUqYNnCYhA&s"
            ),
            description = "Standing Hanuman with Sanjeevani mountain in the bold Vijayanagara tradition. The dynamic posture and detailed crown show master craftsmanship.",
            isAvailable = true
        ),
        Sculpture(
            id = "SKS-008",
            name = "Vishnu - The Preserver",
            shilpiName = "Master Ramaiah B.",
            style = "Dravidian",
            material = "Black Granite",
            price = "₹1,25,000",
            imageUrls = listOf(
                "https://5.imimg.com/data5/SELLER/Default/2025/11/557137971/IQ/NT/EL/203911268/black-granite-vishnu-statue.jpg",
                "https://i0.wp.com/www.craftsodisha.com/wp-content/uploads/2017/06/1300.jpg"
            ),
            timelineImages = listOf(
                "https://i0.wp.com/www.craftsodisha.com/wp-content/uploads/2017/06/1300.jpg"
            ),
            description = "Four-armed Vishnu holding Shankha, Chakra, Gada and Padma. Carved in strict Agama Shastra proportions with a towering Kireetam crown.",
            isAvailable = false
        ),
        Sculpture(
            id = "SKS-009",
            name = "Hoysala Star Temple Panel",
            shilpiName = "Shilpi Krishnamurthy",
            style = "Hoysala",
            material = "Chloritic Schist",
            price = "₹2,50,000",
            imageUrls = listOf(
                "https://assets.cntraveller.in/photos/650c1f1932e526278a0fdce2/1:1/w_1414,h_1414,c_limit/GettyImages-1410729674.jpg",
                "https://upload.wikimedia.org/wikipedia/commons/3/3d/Close_up_of_Hoysala_style_shrine_and_sikhara_with_decorative_molding_frieze_in_the_Chennakeshava_temple_at_Somanathapura.jpg"
            ),
            timelineImages = listOf(
                "https://assets.cntraveller.in/photos/650c1f1932e526278a0fdce2/1:1/w_1414,h_1414,c_limit/GettyImages-1410729674.jpg"
            ),
            description = "A replica panel from the Belur Chennakeshava temple. Features the iconic Hoysala elephant frieze, horse frieze, and Ramayana narrative band — all in a single panel.",
            isAvailable = true
        ),
        Sculpture(
            id = "SKS-010",
            name = "Surya - The Sun God",
            shilpiName = "Shilpi Nagaraj S.",
            style = "Chalukya",
            material = "Soapstone",
            price = "₹92,000",
            imageUrls = listOf(
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT5_Yk0hA9pvfntRxqVI7dz07DHi3SS1zZzgg&s",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR6QuswT81fQGKv3loikidgKY3EXxbMSp_K-w&s"
            ),
            timelineImages = listOf(
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT5_Yk0hA9pvfntRxqVI7dz07DHi3SS1zZzgg&s"
            ),
            description = "Surya riding his seven-horse chariot in Chalukyan style with characteristic star-shaped pedestal. The horses' manes and harness details are extraordinarily fine.",
            isAvailable = true
        )
    )

    fun getHeritageText(style: String): String = when (style) {
        "Hoysala" -> "The Hoysala Empire (1000–1346 CE) produced India's most intricate stone carvings. Temples like Belur and Halebidu feature star-shaped platforms with friezes of elephants, horses, and celestial beings. Shilpis from Shivarapatna carry this 1000-year-old tradition alive today."
        "Dravidian" -> "Dravidian architecture is defined by its towering gopurams and elaborate mandapams. Stone carvers sculpt multi-tiered deities following Agama Shastra proportions passed through generations."
        "Vijayanagara" -> "The Vijayanagara Empire (1336–1646 CE) is celebrated for monolithic sculptures at Hampi. Sculptors followed a bold, powerful style with richly ornamented figures."
        "Chalukya" -> "The Chalukya dynasty (543–753 CE) pioneered a fusion of North and South Indian styles at Badami, Aihole, and Pattadakal — now UNESCO World Heritage Sites."
        else -> "A rich tradition of Indian stone carving spanning over a millennium, rooted in the Shilpa Shastra — the ancient Sanskrit treatise on art and architecture."
    }
}