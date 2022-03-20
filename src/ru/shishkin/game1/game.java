// Указываем имя пакета, если необходимо!
// package game4;


// Подключения необходимых библиотек
import javax.swing.*;

// Главный класс игры
public class game {

	// Главный метод, который запускает игру
	public static void main(String[] args) {
		
		   // Вызов диалогового окна для ввода сложности игры
		   String rez = JOptionPane.showInputDialog(null,"Введите сложность игры от 1 до 15:","Сложность игры",1);
		   
		   // Помещение результата выбора в переменную целого типа
		   //int slogn = rez.charAt(0)-'0';
		   int slogn = Integer.parseInt(rez);
		   // Проверка, что введена цифра от 1 до 7
		   if ((slogn>=1)&&(slogn<=15))
		   {
    	      // Создание окна, в котором находится игровое поле
		      okno window = new okno(slogn);
		   }
	}

}
