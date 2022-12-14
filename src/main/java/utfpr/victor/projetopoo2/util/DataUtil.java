package utfpr.victor.projetopoo2.util;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

/**
 *
 * @author victo
 */
public class DataUtil {
   public static Date converteLocalDateToDate(LocalDate localDate){
       return Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
   } 
}
