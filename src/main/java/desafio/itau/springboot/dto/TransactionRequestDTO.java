package desafio.itau.springboot.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;

import java.time.OffsetDateTime;

public class TransactionRequestDTO {

    @Getter
    @NotNull
    @Min(0)
    private double valor;

    @Getter
    @NotNull
    private OffsetDateTime dataHora;
}
