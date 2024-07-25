package udemy;

import java.time.LocalTime;
import java.time.Duration;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class HourContract {
    private double valorPorHora;
    private LocalTime horaInicio;
    private LocalTime horaFim;
    private DateTimeFormatter fmthora = DateTimeFormatter.ofPattern("HH:mm:ss");

    public HourContract(double valorPorHora, String horaInicioStr, String horaFimStr) {
        this.valorPorHora = valorPorHora;
        this.horaInicio = parseTime(horaInicioStr);
        this.horaFim = parseTime(horaFimStr);
    }
    
    

    public void setHoraInicio(LocalTime horaInicio) {
		this.horaInicio = horaInicio;
	}



	public void setHoraFim(LocalTime horaFim) {
		this.horaFim = horaFim;
	}



	public double getValorPorHora() {
		return valorPorHora;
	}


	public LocalTime getHoraInicio() {
		return horaInicio;
	}


	public LocalTime getHoraFim() {
		return horaFim;
	}

	private LocalTime parseTime(String timeStr) {
        try {
            return LocalTime.parse(timeStr, fmthora);
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Hora inválida: " + timeStr);
        }
    }

    private double calcularValor() {
        long horasTrabalhadas = Duration.between(horaInicio, horaFim).toHours();
        return valorPorHora * horasTrabalhadas;
    }

    public double getValor() {
        return calcularValor();
    }
}
