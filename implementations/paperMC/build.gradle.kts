plugins {
    id("java")
}

group = "com.example.multiserverportals.paperMC"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.bukkit:bukkit:1.17-R0.1-SNAPSHOT") // PaperMC向けの依存関係はBukkitと同じものを使用する
    // 他の依存関係があればここに追加する
}
