package by.training.task2.part5;

public class MyNum {
	public static String toEng(int num){
		String dozens [] = {"twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
		String units [] =  {"one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
		String str ="";
		if(num>=100) {
			str=str.concat(units[num/100-1]+" hundred");//hundreds
		}
		if(10<=num%100 && num%100<20) {//10-19
			str=str.concat(" "+units[num%100-1]);
		} else {//0..9 + 20..99
			if(num%100>=20) {
				str=str.concat(" "+dozens[(num/10)%10-2]);//dozens
			}
			if(num%10>0) {
				str=str.concat(" "+units[num%10-1]);//units
			}
		}
		return(str);
	}
	public static String toRus(int num){
		String hundreds [] = {"сто","двести","триста","четыреста","пятьсот","шестьсот","семьсот","восемьсот","девятьсот"};
		String dozens [] = {"двадцать","тридцать","сорок","пятьдесят","шестьдесят","семьдесят","восемьдесят","девяносто"};
		String units [] =  {"один","два","три","четыре","пять","шесть","семь","восемь","девять","десять","одинадцать","двенадцать","тринадцать","четырнадцать","пятнадцать","шестнадцать","семнадцать","восемнадцать","девятнадцать"};
		String str ="";
		if(num>=100) {
			str=str.concat(hundreds[num/100-1]);//сотни
		}
		if(10<=num%100 && num%100<20) {//10-19
			str=str.concat(" "+units[num%100-1]);
		} else {//0..9 + 20..99
			if(num%100>=20) {
				str=str.concat(" "+dozens[(num/10)%10-2]);//десятки
			}
			if(num%10>0) {
				str=str.concat(" "+units[num%10-1]);//единицы
			}
		}
		return(str);
	}
}
