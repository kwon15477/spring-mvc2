package hello.itemService.wep.validation.form;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.Range;

import java.util.Locale;

@Data
public class ItemUpdateForm {

    @NotNull
    private Locale id;

    @NotBlank
    private String itemName;

    @NotNull
    @Range(min = 1000, max = 1000000)
    private Integer price;

    //수정시 수량 자유
    private Integer quantity;
}
