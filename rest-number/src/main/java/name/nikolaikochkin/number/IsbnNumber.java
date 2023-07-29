package name.nikolaikochkin.number;

import jakarta.json.bind.annotation.JsonbProperty;
import jakarta.json.bind.annotation.JsonbTransient;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

import java.time.Instant;

@Schema(description = "Several ISBN numbers for books")
public class IsbnNumber {
    @Schema(required = true)
    @JsonbProperty("isbn_10")
    public String isbn10;
    @Schema(required = true)
    @JsonbProperty("isbn_13")
    public String isbn13;
    @JsonbTransient
    public Instant generatedDate;

    @Override
    public String toString() {
        return "IsbnNumber{" +
                "isbn10='" + isbn10 + '\'' +
                ", isbn13='" + isbn13 + '\'' +
                ", generatedDate=" + generatedDate +
                '}';
    }
}
