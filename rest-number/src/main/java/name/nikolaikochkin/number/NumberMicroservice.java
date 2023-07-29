package name.nikolaikochkin.number;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;
import org.eclipse.microprofile.openapi.annotations.ExternalDocumentation;
import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@ApplicationPath("/")
@OpenAPIDefinition(
        info = @Info(
                title = "Number Microservice",
                description = "This microservice generates book number",
                version = "1.0.0",
                contact = @Contact(name = "@NikolaiKochkin", url = "https://github.com/nikolaykochkin")
        ),
        externalDocs = @ExternalDocumentation(
                url = "https://github.com/nikolaykochkin/vintage-store",
                description = "All the Microservice code"
        ),
        tags = {
                @Tag(name = "api", description = "Public API that can be used anybody"),
                @Tag(name = "numbers", description = "Anybody interested in numbers")
        }
)
public class NumberMicroservice extends Application {
}
