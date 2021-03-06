object Versions {
    const val kotlinVersion = "1.3.50"
    const val kotlinxCoroutinesVersion = "1.3.2"
    const val kotlinxCollectionsImmutableVersion = "0.3"

    const val cobaltVersion = "2019.1.5-PREVIEW"

    const val caffeineVersion = "2.5.4"
    const val snakeyamlVersion = "1.18"
    const val slf4jVersion = "1.7.25"
    const val logbackVersion = "1.2.3"
    const val gdxVersion = "1.9.8"
    const val filtersVersion =  "2.0.235-1"

    const val junitVersion = "4.12"
    const val mockitoVersion = "1.10.19"
    const val assertjVersion = "3.6.2"
}

object Libs {
    const val kotlinStdLibCommon = "org.jetbrains.kotlin:kotlin-stdlib-common:${Versions.kotlinVersion}"
    const val kotlinStdLibJdk8 = "org.jetbrains.kotlin:kotlin-stdlib-jdk8"
    const val kotlinReflect = "org.jetbrains.kotlin:kotlin-reflect:${Versions.kotlinVersion}"
    const val kotlinxCoroutinesCommon = "org.jetbrains.kotlinx:kotlinx-coroutines-core-common:${Versions.kotlinxCoroutinesVersion}"
    const val kotlinxCoroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.kotlinxCoroutinesVersion}"
    const val kotlinxCollectionsImmutable = "org.jetbrains.kotlinx:kotlinx-collections-immutable:${Versions.kotlinxCollectionsImmutableVersion}"

    const val cobaltEvents = "org.hexworks.cobalt:cobalt.events:${Versions.cobaltVersion}"
    const val cobaltDatabinding = "org.hexworks.cobalt:cobalt.databinding:${Versions.cobaltVersion}"
    const val cobaltLogging = "org.hexworks.cobalt:cobalt.logging:${Versions.cobaltVersion}"
    const val cobaltLoggingJvm = "org.hexworks.cobalt:cobalt.logging-jvm:${Versions.cobaltVersion}"
    const val cobaltDatatypes = "org.hexworks.cobalt:cobalt.datatypes:${Versions.cobaltVersion}"

    const val caffeine = "com.github.ben-manes.caffeine:caffeine:${Versions.caffeineVersion}"
    const val snakeYaml = "org.yaml:snakeyaml:${Versions.snakeyamlVersion}"
    const val slf4jApi = "org.slf4j:slf4j-api:${Versions.slf4jVersion}"
    const val gdx = "com.badlogicgames.gdx:gdx:${Versions.gdxVersion}"
    const val gdxFreetype = "com.badlogicgames.gdx:gdx-freetype:${Versions.gdxVersion}"
    const val gdxFreetypePlatform = "com.badlogicgames.gdx:gdx-freetype-platform:${Versions.gdxVersion}"
    const val gdxBox2D = "com.badlogicgames.gdx:gdx-box2d:${Versions.gdxVersion}"
    const val gdxBackendLwjgl = "com.badlogicgames.gdx:gdx-backend-lwjgl:${Versions.gdxVersion}"
    const val gdxPlatform = "com.badlogicgames.gdx:gdx-platform:${Versions.gdxVersion}:natives-desktop"
    const val gdxBox2DPlatform = "com.badlogicgames.gdx:gdx-box2d-platform:${Versions.gdxVersion}:natives-desktop"
    const val logbackClassic = "ch.qos.logback:logback-classic:${Versions.logbackVersion}"
    const val filters = "com.jhlabs:filters:${Versions.filtersVersion}"
}

object LibsTest {
    const val kotlinTestCommon = "org.jetbrains.kotlin:kotlin-test-common"
    const val kotlinTestAnnotationsCommon = "org.jetbrains.kotlin:kotlin-test-annotations-common"

    const val junit = "junit:junit:${Versions.junitVersion}"
    const val mockitoAll = "org.mockito:mockito-all:${Versions.mockitoVersion}"
    const val assertJCore = "org.assertj:assertj-core:${Versions.assertjVersion}"
    const val logbackClassic = "ch.qos.logback:logback-classic:${Versions.logbackVersion}"
    const val logbackCore = "ch.qos.logback:logback-core:${Versions.logbackVersion}"
}