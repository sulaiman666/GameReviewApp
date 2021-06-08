package id.solo.gamereviewapp.model

import id.solo.gamereviewapp.R

object GameData {
    private val gameJudul = arrayOf(
        "Dota 2",
        "Dragonball FighterZ",
        "Tekken 7",
        "Warframe",
        "Valorant",
        "GWENT: The Witcher Card Game",
        "Apex Legend",
        "Destiny 2",
        "Sekiro Shadow Die Twice",
        "Dying Light"
    )

    private val gameAbout = arrayOf(
        "\t\tEvery day, millions of players worldwide enter battle as one of over a hundred Dota " +
                "heroes. And no matter if it\'s their 10th hour of play or 1,000th, there\'s always " +
                "something new to discover. With regular updates that ensure a constant evolution of " +
                "gameplay, features, and heroes, Dota 2 has taken on a life of its own.",
        "\t\tDRAGON BALL FighterZ is born from what makes the DRAGON BALL series so loved and " +
                "famous: endless spectacular fights with its all-powerful fighters.",
        "\t\tDiscover the epic conclusion of the long-time clan warfare between members of the " +
                "Mishima family. Powered by Unreal Engine 4, the legendary fighting game franchise fights back with stunning story-driven cinematic battles and intense duels that can be enjoyed with friends and rivals.",
        "\t\tWarframe is a cooperative free-to-play third person online action game set in an " +
                "evolving sci-fi world.",
        "\t\tValorant is a tactical shooting game involving two teams with 5 players in each team. " +
                "Every player can sign in and play remotely from anywhere in the world. Every game " +
                "has 25 rounds and the team that wins 13 of them first wins the game. Players can " +
                "choose their in-game characters called agents at the start of the game. Players can " +
                "buy abilities and weapons at the start of the game.",
        "\t\tCommand mighty Witcher-world heroes in epic online PvP card battles! ",
        "\t\tApex Legends is the award-winning, free-to-play Hero shooter from Respawn Entertainment. " +
                "Master an ever-growing roster of legendary characters with powerful abilities and " +
                "experience strategic squad play and innovative gameplay in the next evolution of " +
                "Hero Shooter and Battle Royale.",
        "\t\tDestiny 2 is an action MMO with a single evolving world that you and your friends can " +
                "join anytime, anywhere, absolutely free.",
        "\t\tGame of the Year - The Game Awards 2019 Best Action Game of 2019 - IGN Carve your own " +
                "clever path to vengeance in the award winning adventure from developer FromSoftware, " +
                "creators of Bloodborne and the Dark Souls series. Take Revenge. Restore Your Honor. " +
                "Kill Ingeniously.",
        "\t\tFirst-person action survival game set in a post-apocalyptic open world overrun by " +
                "flesh-hungry zombies. Roam a city devastated by a mysterious virus epidemic. " +
                "Scavenge for supplies, craft weapons, and face hordes of the infected."
    )

    private val gameLogo = intArrayOf(
        R.drawable.logo_dota2,
        R.drawable.logo_dbfz,
        R.drawable.logo_tekken7,
        R.drawable.logo_warframe,
        R.drawable.logo_valorant,
        R.drawable.logo_gwent,
        R.drawable.logo_apex,
        R.drawable.logo_destiny2,
        R.drawable.logo_sekiro,
        R.drawable.logo_dyinglight
    )

    private val gameBanner = intArrayOf(
        R.drawable.banner_dota2,
        R.drawable.banner_dbfz,
        R.drawable.banner_tekken7,
        R.drawable.banner_warframe,
        R.drawable.banner_valorant,
        R.drawable.banner_gwent,
        R.drawable.banner_apex,
        R.drawable.banner_destiny2,
        R.drawable.banner_sekiro,
        R.drawable.banner_dyinglight
    )

    private val gameLink = arrayOf(
        "https://store.steampowered.com/app/570/Dota_2/",
        "https://store.steampowered.com/app/678950/DRAGON_BALL_FighterZ/",
        "https://store.steampowered.com/app/389730/TEKKEN_7/",
        "https://store.steampowered.com/app/230410/Warframe/",
        "https://playvalorant.com/en-us/download/",
        "https://store.steampowered.com/app/1284410/GWENT_The_Witcher_Card_Game/",
        "https://store.steampowered.com/app/1172470/Apex_Legends/",
        "https://store.steampowered.com/app/1085660/Destiny_2/",
        "https://store.steampowered.com/app/814380/Sekiro_Shadows_Die_Twice__GOTY_Edition/",
        "https://store.steampowered.com/app/239140/Dying_Light/"
    )

    private val gameDetail = arrayOf(
        "\t\tUntuk pecinta Moba saya merekomendasikan Dota 2, dikarenakan kemungkinan yang tidak " +
                "terbatas yang dapat terjadi di dalam permainan Dota 2. Saya sebagai seseorang yang " +
                "mudah bosan dengan pengulangan/repetition akan sebuah permainan menemukan hal " +
                "tersebut tidak mungkin terjadi didalam permainan dota yang telah saya mainkan sejak " +
                "tahun 2018. Hal tersebut dikarenakan game Dota menawarkan 121 hero yang dapat " +
                "digunakan dalam permainan tersebut yang akan digunakan oleh 10 pemain hanya dengan " +
                "itu saja Dota sudah memberikan 14.044.249.615.291.896 kemungkinan hanya untuk tahap " +
                "pemilihan hero saja.\n" +
                "\t\tNamun tidak hanya itu saja Dota juga menawarkan 208 item yang dapat digunakan oleh tiap " +
                "hero dimana item tersebut memiliki kelebihan masing – masing yang dapat membantu " +
                "hero anda untuk memperkuat hero anda maupun mengeksploitasi kelemahan hero musuh " +
                "anda agar anda dapat menang bertarung melawan hero tersebut sehingga hal tersebut " +
                "juga menawarkan jutaan kemungkinan yang dapat anda lakukan dalam permainan tersebut " +
                "yang menjauh kan anda dari kata bosan. \n" +
                "\t\tTidak hanya itu saja dikarenakan Dota 2 merupakan game multiplayer yang berarti " +
                "anda melawan manusia lain dimana kemungkinan permainan untuk seorang pemain saja " +
                "bisa mencapai jutaan apa lagi bila anda bermain bersama empat pemain lain dan " +
                "melawan lima pemain lain? Apakah hal tersebut memberikan anda bahkan sekelibat " +
                "kata bosan? Saya pikir tidak, sehingga hanya dengan variasi yang disediakan secara " +
                "umum oleh permainan tersebut saja saya sudah dapat merekomendasikan game Dota 2.\n" +
                "\t\tBagaimana jika dengan hal lainnya seperti gameplay dll? Saya merekomendasikan anda " +
                "untuk mencobanya sendiri dikarenakan hal tersebut akan terasa luar biasa saat anda " +
                "mencobanya sendiri akan intensitas permainan, variasi permainan, dan banyak hal " +
                "ditawarkan oleh Dota 2 kepada pemainnya.",
        "\t\tGame ini saya rekomendasikan dikarenakan saya adalah fanboi dari serial Dragonball dan " +
                "game Dragonball FighterZ (DBFZ) adalah game serial Dragonball terbaik setelah " +
                "Dragonball Budokai Tenkaichi 3 yang direlease pada tahun 2005. DBFZ juga akan " +
                "memanjakan anda bila anda merupakan fans dari series Dragonball, dikarenakan DBFZ " +
                "akan memanjakan anda dengan pilihan karakter – karakter yang iconic dari Dragonball " +
                "series. Juga anda akan dimanjakan dengan visual yang mumpuni yang akan memanjakan " +
                "mata tidak hanya pecinta Dragonball namun untuk semua orang yang melihat visual " +
                "yang di tawarkan DBFZ.\n" +
                "\t\t Dalam permainan ini anda akan ditawarkan 43 karakter (19 karakter DLC, 3 " +
                "unlockable karakter, dan 21 base karakter) dan dalam pertarungan tersebut anda akan " +
                "menggunakan 3 karakter yang ingin anda gunakan. Ketiga karakter tersebut merupakan " +
                "petarung anda dan anda akan mengendalikan ketiga karakter tersebut untuk " +
                "mengalahkan musuh anda. Setiap karakter setidaknya memiliki dua gerakan mutakhir " +
                "khusus untuk karakter tersebut yang merupakan ciri khas karakter tersebut didalam " +
                "series Dragonball sehingga memanjakan anda para pecinta series Dragonball.\n" +
                "\t\t DBFZ merupakan game bergenre 2D Fighting yang menyediakan mode World Fight yang " +
                "merupakan mode online dari game tersebut dan anda akan bertarung melawan petarung " +
                "yang hebat dan anda akan terus berada diujung kursi anda dikarenakan intensitas " +
                "akan pertarungan yang terjadi didalam permainan tersebut. Permaninan tersebut akan " +
                "terus memberikan anda adrenaline yang merupakan candu bagi para adrenaline junkie " +
                "namun juga dengan memanjakan jiwa pecinta Dragonball yang anda miliki.\n",
        "\t\tTekken 7 saya rekomendasikan karena menurut saya Tekken 7 adalah game Fighting yang " +
                "dapat dinikmati oleh kebanyakan orang dikarenakan Tekken merupakan game fighting " +
                "yang paling di gandrungi oleh pecinta game fighting. Dikarenakan Tekken menawarkan " +
                "gameplay yang complex but rewarding, karakter yang memiliki identitas masing – " +
                "masing yang menyesuaikan dengan banyak gameplay atau cara bermain banyak orang. " +
                "Tekken 7 menawarkan 51 Karakter (13 DLC Character, 38 Base Character) dan setiap " +
                "karakter tersebut memiliki identitas masing – masing yang membedakan mereka dengan " +
                "yang lain.\n" +
                "\t\tSeperti saya yang merupakan pemain yang menyukai Mishima Style namun saya juga suka " +
                "dengan Graple Style, dimana karakter Armor King merupakan karakter yang sesuai " +
                "dengan style yang saya sukai dikarenakan Armor King merupakan gabungan dari kedua " +
                "hal tersebut. Bahkan untuk Mishima style pun itu masih berbeda untuk tiga karakter " +
                "Tekken 7 yang menerapkan Mishima style, Mishima Style untuk individu tersebut pun " +
                "memiliki identitas mereka masing masing. Memiliki kelebihan dan kekurangan yang " +
                "berbeda untuk tiap individu sehingga hal tersebut benar – benar membedakan ketiga " +
                "karakter tersebut walaupun menerapkan style yang sama.\n" +
                "\t\tTekken 7 merupakan game 3D Fighting yang menawarkan pergerakan 3D sehingga anda " +
                "tidak hanya bergerak maju mundur saja, namun juga kiri kanan maupun serong. Anda " +
                "akan menggunakan satu karakter dan anda akan bertarung dengan mode best of three. " +
                "Dikarenakan pergerakan yang kompleks gameplay dari Tekken 7 juga menerapkan area " +
                "luas dikarenakan movement adalah kunci penting dalam pertarungan Tekken. Tekken " +
                "juga menawarkan serangan mutakhir khusus untuk tiap karakter yang dapat " +
                "menyelamatkan anda dalam posisi genting, dikarenakan gerakan tersebut hanya dapat " +
                "di gunakan saat darah/health point anda mendekati nol.",
        "\t\tAnda ingin mencoba menjadi Space Ninja? Menjadi ninja yang paling mematikan diantariksa " +
                "ini? Maka Warframe adalah game yang cocok untuk anda dikarenakan game tersebut " +
                "menceritakan anda seorang ninja terkuat diantariksa. Anda adalah Last Bastion untuk " +
                "mengalahkan ancaman yang terdapat diantariksa, dan anda adalah harapan antariksa " +
                "saat mereka menghadapi keputusasaan.\n" +
                "\t\tAnda adalah sebuah jiwa yang dapat mengendalikan frame/wadah untuk anda kendalikan. " +
                "Tiap wadah memiliki kekuatan yang berbeda dengan skill yang berbeda – beda untuk " +
                "memenuhi kebutuhan player berdasarkan gameplay yang disukai oleh pemain tersebut. " +
                "Anda akan dimanjakan dengan gameplay yang seakan akan anda adalah ninja yang dapat " +
                "melakukan double jump, wall running, menggunakan senjata seperti kunai atau " +
                "shuriken, dan juga jangan lupa anda juga dapat menggunakan senjata senjata modern " +
                "layaknya pistol maupun assault rifle. Sehingga anda juga merupakan ninja modern " +
                "dimana tidak terbatas hanya senjata ninja tradisional.\n" +
                "\t\tWarframe menawarkan mode co-op dimana anda dapat bermain dengan hingga tiga orang " +
                "sehingga anda dapat berpetualang dan menyelamatkan antariksa bersama, melawan " +
                "ancaman yang terdapat di antariksa ini bersama.",
        "\t\tUntuk anda pecinta competitive fps game, i got this for ya. Game Valorant adalah game " +
                "first person shooter (FPS) yang menawarkan tingkat competitive setara dengan " +
                "Counter Strike: Global Offensive (CSGO). Menawarkan gameplay yang sama atau bahkan " +
                "setara dengan permainan competitive CSGO yang banyak disukai oleh banyak " +
                "pecintanya. Valorant memberikan identitas game tersebut dengan bantuan skill unique " +
                "yang dapat digunakan oleh setiap karakter yang dapat anda mainkan dalam permainan " +
                "tersebut. Tentu saja skill tersebut memberikan identitas untuk masing – masing " +
                "karakter, yang dapat disesuaikan dengan cara bermain anda.\n" +
                "\t\tDikarenakan tingginya tingkat competitive dalam permainan Valorant anda benar – " +
                "benar akan ditest seberapa hebatnya anda dalam permainan FPS. Anda akan merasakan " +
                "diri anda terus berada di posisi yang sulit dimana anda harus menggunakan kemampuan " +
                "menembak anda dan skill karakter anda untuk mengeluarkan anda dari posisi sulit " +
                "tersebut, bahkan membuat diri anda selamat dan menang dari posisi tersebut. Dalam " +
                "permainan ini semua bergantung pada diri anda, anda yang akan menentukan menang " +
                "atau kalahnya permainan buktikan dalam permainan bahwa “There is no luck, but " +
                "skill”.",
        "\t\tUntuk anda yang telah memainkan game The Witcher Series pasti anda tidak asing dengan " +
                "permainan bernama GWENT. GWENT awalnya adalah mini-game yang terdapat didalam " +
                "permainan The Witcher Series. Dikarenakan permainan kartu tersebut banyak disukai " +
                "oleh pemain yang memainkan The Witcher, akhirnya CD Projekt Red membuat stand alone " +
                "game yang didasari dari permainan mini-game GWENT. Langkah tersebut merupakan " +
                "langkah yang jenius dikarenakan setelah direlease banyak sekali pemain casual " +
                "maupun competitive card game menyukai game tersebut dan menjadi game yang " +
                "digandrungi oleh pecinta card game. Dikarenakan fleksibilitas dan keseruan yang " +
                "ditawarkan oleh GWENT.\n" +
                "\t\tAnda akan ditawarkan dengan enam fraksi yang menawarkan gameplay yang berbeda dan " +
                "sesuai dengan kebutuhan anda. Salah satunya adalah Skellige adalah fraksi yang saya " +
                "gunakan, dikarenakan reliabilitas fraksi Skellige. Fraksi Skellige menawarkan cara " +
                "permainan yang agresif namun juga memberikan anda reward bila anda memahami dan " +
                "memaksimalkan permainan agresif anda. Dikarenakan Skellige merupakan suku barbar " +
                "yang mencintai kekerasan, sehingga semakin banyak luka yang dimiliki musuh maupun " +
                "anda merupakan sumber kekuatan yang akan dimanfaatkan oleh fraksi skellige. " +
                "Semakin banyak yang terluka maupun dilukai fraksi skellige akan semakin kuat. Namun " +
                "tentu saja dikarenakan fleksibilitas yang ditawarkan oleh GWENT, terdapat fraksi " +
                "yang dapat mengganggu atau bahkan mengalahkan cara bermain para pengguna fraksi " +
                "Skellige.\n" +
                "\t\tContohnya adalah Nilfgaard, yang merupakan fraksi kesatria dimana kebanyakan " +
                "menawarkan armor atau pelindung yang melindungi kartu anda untuk menerima damage. " +
                "Ada juga Monster yang tidak takut untuk mengorbankan kartunya bila kartu tersebut " +
                "terluka, dikarenakan bagi monster pengorbanan merupakan hal yang diperlukan bagi " +
                "mereka untuk kaum mereka maupun anak – anak mereka. Sehingga setelahnya akan muncul " +
                "kartu yang lebih kuat untuk menggantikan posisi monster yang telah mengorbankan " +
                "dirinya. Sehingga tidak ada faction terkuat, anda harus memainkan strategi yang " +
                "mutakhir agar anda dapat menang bahkan melawan fraksi yang dari awal sudah " +
                "mengalahkan anda dalam pertempuran.\n",
        "\t\tUntuk para pecinta battle royale, Apex Legend adalah rekomendasi yang pasti akan " +
                "direkomendasikan oleh para pecinta battle royale. Dengan mekanisme permainan yang " +
                "kompleks dan unique dikarenakan tema yang diambil adalah bumi dimasa depan. Dengan " +
                "teknologi yang memasuki ranah science fiction memberikan gawai yang unik dan " +
                "menyenangkan. Serta karakter yang dapat digunakan digame Apex Legend juga memiliki " +
                "skill unik mereka tersendiri yang membedakan mereka dari yang lainnya. Skill yang " +
                "dimiliki juga merupakan skill yang sudah memasuki ranah science fiction seperti " +
                "karakter yang dapat membuat gerbang antar dimensi untuk digunakan berpindah tempat. " +
                "Membuat proyeksi diri yang mendekati sempurna untuk mengelabui lawan. Serta tentu " +
                "saja terdapat gawai yang dapat membuat sebuah miniature dari black hole, dan tentu " +
                "saja hal miniature tersebut memiliki semua yang dimiliki black hole. \n" +
                "\t\tDikarenakan mode yang ditawarkan adalah battle royale maka anda dapat membentuk tim " +
                "berisikan empat orang. Yang akan menjadi rekan anda menjadi penyintas dari " +
                "permainan maut tersebut. Anda akan juga diberikan gawai dan senjata yang merupakan " +
                "gabungan dari science dan imajinasi, yang akan memenuhi kebutuhan anda para pecinta " +
                "sci-fi. Serta gameplay yang menyenangkan membuat anda merasakan bagaimana rasanya " +
                "menjadi tentara super dimasa depan, dengan kemampuan wall running, sliding, " +
                "gliding, dan banyak lg. Serta map yang ditawarkan oleh Apex Legend sangat lah " +
                "massive sehingga anda akan dimanjakan dengan lapangan permainan yang luas sehingga " +
                "anda diberikan banyak pilihan bagaimana anda akan memulai permainan tersebut. Anda " +
                "diawali dengan diri anda sendiri sehingga anda perlu berpetualang untuk looting " +
                "item seperti armor, gawai, dan tentu saja senjata dan pelurunya. Sehingga anda akan " +
                "memiliki start yang sama dengan semua orang, lakukan apapun untuk mencapai puncak " +
                "dan menjadi penyintas sesungguhnya.\n",
        "\t\tDestiny 2 menawarkan mode yang sama dengan permainan Warframe, namun yang membedakan " +
                "adalah anda merupakan Space Guardian yang memiliki kekuatan cahaya yang diambil " +
                "dari bintang yang terdapat didekat markas para Space Guardian. Anda juga ditawarkan " +
                "mode permainan MMO dimana anda dapat bertarung dengan banyak pemain lain maupun " +
                "bekerja sama untuk menyelesaikan misi yang sulit dimana memerlukan kerja sama dari " +
                "banyak orang. Dikarenakan mode MMO anda dapat mengubah setiap bagian dari pakaian " +
                "maupun armor yang anda gunakan, anda dapat membuat penampilan yang sesuai dengan " +
                "keinginan anda namun juga memberikan efek maupun status yang anda butuhkan.\n" +
                "\t\tTerdapat juga guild sistem dimana anda dapat memiliki kelompok ataupun fraksi anda " +
                "sendiri, dimana dengan adanya guild sistem itu terdapat mode perebutan daerah yang " +
                "dapat anda lakukan dengan teman – teman anda dari guild yang sama. Anda akan " +
                "melawan guild lain dalam mode peperangan antara dua guild, antara guild anda dan " +
                "musuh anda. Yang menang akan dapat mengambil hak akan daerah yang dimiliki oleh " +
                "lawan anda sebelumnya maupun menang untuk mempertahankan hak daerah yang anda " +
                "miliki.\n",
        "\t\tUntuk anda yang mencintai tantangan, ataupun mungkin membenci diri anda sendiri Sekiro " +
                "Shadow Die Twice adalah game yang tepat untuk anda. Sekiro menawarkan game yang " +
                "challanging dan tidak memberi ampun, dimana game akan selalu menempatkan anda " +
                "diposisi yang mengancam. Dikarenakan baik bos maupun mini-boss memiliki serangan " +
                "yang sangat mematikan, dimana sekali terkena serangan tersebut karakter anda bisa " +
                "mati hanya karena serangan tersebut. Pola serangan boss, mini-boss, dan bahkan " +
                "musuh biasanya saja sulit untuk dihadapi bisa musuh berjumlah lebih dari satu.\n" +
                "\t\tDalam permainan Sekiro anda merupakan seorang samurai yang memiliki tugas untuk " +
                "menyelamatkan tuan anda dari kematian. Anda diberikan kekuatan Dragon Blood dimana " +
                "pemilik darah tersebut dapat hidup kembali setelah mati. Namun setiap anda hidup " +
                "kembali Dragon Blood akan memberikan efek buruk terhadap tubuh anda, sehingga lebih " +
                "baik bila anda tidak perlu menggunakan kekuatan tersebut. Untuk mencapai hal " +
                "tersebut bukanlah hal mudah bahkan sangat sulit untuk dicapai, namun itu lah yang " +
                "menarik dari permainan Sekiro dimana anda akan terus mencoba untuk menantang diri " +
                "anda terus dan terus sehingga anda dapat mencapai tantangan tersulit. Tidak akan " +
                "pernah membuat jiwa haus tantangan anda bosan atau kurang asupan, dikarenakan " +
                "Sekiro memiliki segudang tantangan untuk anda hadapi.\n",
        "\t\tDying Light adalah game FPS dengan tema Post Apocalyptic dimana sebuah kota fiksi terjangkit dengan virus mematikan yang mengubah manusia yang terjangkit virus tersebut akan menjadi zombie. Anda adalah agen pemerintah yang dipercaya untuk mempelajari sumber dari virus tersebut sehingga dia mendatangi kota sumber virus tersebut. Lalu anda akan berpetualang menjalani kehidupan seorang agen yang akan menguak sumber dari virus tersebut.\n" +
                "\t\tDying Light menerapkan parkour sebagai mekanisme pemain dalam bergerak dan " +
                "mengelilingi kota tersebut. Sehingga jalan, tembok, maupun atap adalah tempat anda " +
                "berlari untuk mengitari dan mencari tau kebenaran yang terdapat didalam kota " +
                "tersebut. Pada pagi hingga sore hari, anda akan menghadapi zombie yang kebanyakan " +
                "adalah zombie yang lamban dan lemah sehingga anda menjadi pemburu didunia tersebut. " +
                "Namun saat malam hari anda bukan lagi pemburu, melainkan anda menjadi yang diburu." +
                "\n" +
                "\t\tAnda akan menghadapi zombie dilingkungan yang menguntungkan zombie, sehingga zombie " +
                "akan bergerak lebih lincah bahkan memiliki skill berlari yang sama seperti anda " +
                "yang disebut Night Walker. Sehingga anda tidak punya pilihan lain selain berlari " +
                "secepat mungkin ketempat yang aman, dikarenakan anda diburu tidak hanya oleh satu " +
                "zombie namun bisa berjumlah banyak lebih dari tiga Night Walker.\n" +
                "\t\tTidak hanya Night Walker yang harus anda waspadai pada malam hari namun juga " +
                "terdapat Volatile, yang merupakan penguasa malam hari. Zombie tersebut telah " +
                "termutasi hingga memiliki kemampuan berlari bahkan lebih cepat daripada Night " +
                "Walker, sehingga anda tidak dapat mengalahkan Volatile dalam adu lari anda harus " +
                "menggunakan sekeliling anda serta menggunakan segala kemampuan otak maupun lari " +
                "anda. Sehingga berhati – hati lah saat anda keluar pada malam hari, so Good Night " +
                "and Good Luck.\n"
    )

    private val gameSpec = arrayOf(
        mapOf(
            "os" to "Windows 7 or newer",
            "cpu" to "Dual core from Intel or AMD at 2.8 GHz",
            "memory" to "4 GB RAM",
            "gpu" to "nVidia GeForce 8600/9600GT, ATI/AMD Radeon HD2600/3600",
            "directx" to "Version 9.0c",
            "network" to "Broadband Internet connection",
            "storage" to "15 GB available space",
            "soundcard" to "DirectX Compatible"
        ),
        mapOf(
            "os" to "Windows 7/8/10 (64-bit OS required)",
            "cpu" to "AMD FX-4350, 4.2 GHz / Intel Core i5-3470, 3.20 GHz",
            "memory" to "4 GB RAM",
            "gpu" to "Radeon HD 6870, 1 GB / GeForce GTX 650 Ti, 1 GB",
            "directx" to "Version 11",
            "network" to "Broadband Internet connection",
            "storage" to "6 GB available space",
            "soundcard" to "DirectX compatible soundcard or onboard chipset"
        ),
        mapOf(
            "os" to "Windows 7/8/10 (64-bit OS required)",
            "cpu" to "Intel Core i3-4160 @ 3.60GHz or equivalent",
            "memory" to "6 GB RAM",
            "gpu" to "NVIDIA GeForce GTX 660 2GB, GTX 750Ti 2GB, or equivalent",
            "directx" to "Version 11",
            "network" to "Broadband Internet connection",
            "storage" to "60 GB available space",
            "soundcard" to "DirectX compatible soundcard or onboard chipset"
        ),
        mapOf(
            "os" to "Windows 7 64-Bit (32-bit not supported)",
            "cpu" to "Intel Core 2 Duo e6400 or AMD Athlon x64 4000+",
            "memory" to "4 GB RAM",
            "gpu" to "DirectX 11+ capable Graphics Card",
            "directx" to "DirectX 11+",
            "network" to "Broadband Internet connection",
            "storage" to "35 GB available space",
            "soundcard" to "DirectX Compatible"
        ),
        mapOf(
            "os" to "Windows 7 or newer",
            "cpu" to "Intel Core i3-370M",
            "memory" to "4 GB Ram",
            "gpu" to "Intel HD 3000",
            "directx" to "Version 9.0c",
            "network" to "Broadband Internet connection",
            "storage" to "100 GB available space",
            "soundcard" to "DirectX Compatible"
        ),
        mapOf(
            "os" to "7/8/8.1/10 (64 bit)",
            "cpu" to "Intel Celeron G1820 | AMD A4-7300",
            "memory" to "4 GB Ram",
            "gpu" to "NVIDIA GeForce GT 730 | Radeon R7 240",
            "directx" to "Version 9.0c",
            "network" to "Broadband Internet connection",
            "storage" to "5 GB available space",
            "soundcard" to "DirectX Compatible"
        ),
        mapOf(
            "os" to "Windows 7 64-Bit (32-bit not supported)",
            "cpu" to "AMD FX 4350 or Equivalent, Intel Core i3 6300 or Equivalent",
            "memory" to "6 GB Ram",
            "gpu" to "AMD Radeon™ HD 7730, NVIDIA GeForce® GT 640",
            "directx" to "Version 11",
            "network" to "Broadband Internet connection",
            "storage" to "56 GB available space",
            "soundcard" to "DirectX Compatible"
        ),
        mapOf(
            "os" to "Windows® 7 / Windows® 8.1 / Windows® 10 64-bit (latest Service Pack)",
            "cpu" to "Intel® Core™ i3 3250 3.5 GHz or Intel Pentium G4560 3.5 GHz / AMD FX-4350 4.2 GHz",
            "memory" to "6 GB Ram",
            "gpu" to "NVIDIA® GeForce® GTX 660 2GB or GTX 1050 2GB / AMD Radeon HD 7850 2GB",
            "directx" to "Version 11",
            "network" to "Broadband Internet connection",
            "storage" to "105 GB available space",
            "soundcard" to "DirectX Compatible"
        ),
        mapOf(
            "os" to "Windows 7 64-bit | Windows 8 64-bit | Windows 10 64-bit",
            "cpu" to "Intel Core i3-2100 | AMD FX-6300",
            "memory" to "4 GB RAM",
            "gpu" to "NVIDIA GeForce GTX 760 | AMD Radeon HD 7950",
            "directx" to "Version 11",
            "network" to "Broadband Internet connection",
            "storage" to "25 GB available space",
            "soundcard" to "DirectX Compatible"
        ),
        mapOf(
            "os" to "Windows® 7 64-bit / Windows® 8 64-bit / Windows® 8.1 64-bit",
            "cpu" to "Intel® Core™ i5-2500 @3.3 GHz / AMD FX-8320 @3.5 GHz",
            "memory" to "4 GB RAM DDR3",
            "gpu" to "NVIDIA® GeForce® GTX 560 / AMD Radeon™ HD 6870 (1GB VRAM)",
            "directx" to "Version 11",
            "network" to "Broadband Internet connection",
            "storage" to "40 GB available space",
            "soundcard" to "DirectX Compatible"
        )


    )


    val listData: ArrayList<Game>
        get() {
            val list = arrayListOf<Game>()
            for (position in gameJudul.indices) {
                val game = Game()
                game.judul = gameJudul[position]
                game.about = gameAbout[position]
                game.logo = gameLogo[position]
                game.banner = gameBanner[position]
                game.link = gameLink[position]
                game.detail = gameDetail[position]
                game.spec = gameSpec[position]
                list.add(game)
            }
            return list
        }

}