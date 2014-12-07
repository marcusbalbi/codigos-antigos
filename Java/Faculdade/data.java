

package utilitarios;
import java.util.Date;
import java.text.SimpleDateFormat;
/**
 *
 * @author Marcus
 */
public class data {

    private String dia, mes, ano, dia_semana,nome_mes, hora;
    SimpleDateFormat horaformatada = new SimpleDateFormat("HH:mm:ss");



    public void le_hora()
    {
        Date horaatual = new Date();
        hora = horaformatada.format(horaatual);

    }

    public String get_hora()
    {
        return hora;
    }



    public void le_data()
    {
        Date data = new Date();
        mes=""+ (data.getMonth()+1);
        dia=""+data.getDate();
        ano=""+(1900+data.getYear());
       
        switch(data.getDay())
        {
            case 0: dia_semana="Domingo";break;
            case 1: dia_semana="Segunda Feira";break;
            case 2: dia_semana="Terça Feira";break;
            case 3: dia_semana="Quarta Feira";break;
            case 4: dia_semana="Quinta Feira";break;
            case 5: dia_semana="Sexta feira";break;
            case 6: dia_semana="Sabado";break;
        }

        switch(data.getMonth())
        {
            case 0: nome_mes="Janeiro";break;
            case 1: nome_mes="Fevereio";break;
            case 2: nome_mes="Março";break;
            case 3: nome_mes="Abril";break;
            case 4: nome_mes="Maio";break;
            case 5: nome_mes="Junho";break;
            case 6: nome_mes="Julho";break;
            case 7: nome_mes="Agosto";break;
            case 8: nome_mes="Setembro";break;
            case 9: nome_mes="Outubro";break;
            case 10: nome_mes="Novembro";break;
            case 11: nome_mes="Dezembro";break;
        }

    }

    public String get_data()
    {
        return dia_semana+" ,"+"Dia "+dia+" de "+nome_mes+ " de "+ano;

    }

}
