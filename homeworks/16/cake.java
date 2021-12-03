class Cake{
	Candle[] candles;
	public Cake(int n){
		candles = new Candle[n];
		for (int i =1; i<=n;i++){
			Candle candle = new Candle(i);
			candles[i-1] = candle;
		}
	}
	public void turnOn(){
		for (Candle i: candles){
			i.turnOn();
		}
	}
	public void turnOff(){
		for (Candle i: candles){
			i.turnOff();
		}
	}
	public int getState(){
		int counter = 0;
		for (Candle i: candles){
			if (i.getState()){
				counter++;
			}
		}
		return counter;
	}
}