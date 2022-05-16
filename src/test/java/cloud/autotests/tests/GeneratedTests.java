package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class GeneratedTests extends TestBase {
    @Test
    @Description("Soon to be implemented by you (or QA.GURU engineers)")
    @DisplayName("Тесты для hypeauditor")
    void generatedTest() {
        step("открыть 'https://hypeauditor.com/'", () -> {
            step("// todo: just add selenium action");
        });

        step("найти 'Influencer Analytics'", () -> {
            step("// todo: just add selenium action");
        });

        step("навести на 'Influencer Analytics'", () -> {
            step("// todo: just add selenium action");
        });

        step("найти 'Analyze social media influencers and get statistics for any account and channel'", () -> {
            step("// todo: just add selenium action");
        });

        step("нажать 'Check influencer'", () -> {
            step("// todo: just add selenium action");
        });

        step("найти 'Analyze any influencer…'", () -> {
            step("// todo: just add selenium action");
        });

        step("ввести 'olymarkes'", () -> {
            step("// todo: just add selenium action");
        });

        step("выбрать 'Instagram'", () -> {
            step("// todo: just add selenium action");
        });

        step("выбрать 'Ольга Маркес'", () -> {
            step("// todo: just add selenium action");
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page title should have header text")
    void titleTest() {
        step("Open url 'https://hypeauditor.com/'", () ->
            open("https://hypeauditor.com/"));

        step("Page title should have text '100% AI-Powered Influencer Marketing Platform | HypeAuditor'", () -> {
            String expectedTitle = "100% AI-Powered Influencer Marketing Platform | HypeAuditor";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page console log should not have errors")
    void consoleShouldNotHaveErrorsTest() {
        step("Open url 'https://hypeauditor.com/'", () ->
            open("https://hypeauditor.com/"));

        step("Console logs should not contain text 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }
}