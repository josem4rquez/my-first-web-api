package dio.web.api.doc;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
            .info(new Info()
                .title("API de Exemplo")
                .version("1.0.0")
                .description("Documentação da API de exemplo")
                .termsOfService("http://www.seusite.com.br/termos")
                .license(new License()
                 .name("Licença - Sua Empresa")
                 .url("http://www.seusite.com.br/licença"))
                .contact(contato()));

    }


    private Contact contato() {
        return new Contact()
            .name("Seu nome")
            .url("http://www.seusite.com.br")
            .email("voce@seusite.com.br");
    } 

}
