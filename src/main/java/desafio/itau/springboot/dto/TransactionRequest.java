package desafio.itau.springboot.dto;

import java.time.OffsetDateTime;

import io.micrometer.common.lang.NonNull;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public class TransactionRequest {

    @NonNull
    @Min(0)
    private Double valor;

    @NotNull
    private OffsetDateTime dataHora;

    public Double getValor() {
        return valor;
    }

    public OffsetDateTime getDataHora() {
        return dataHora;
    }
}
