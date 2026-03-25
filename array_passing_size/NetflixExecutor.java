class NetflixExecutor{
 public static void main(String[] args){
    Netflix netflix = new Netflix();
	netflix.addWebSeries("game of throne");
	netflix.addWebSeries("with love");
	netflix.addWebSeries("vikings");
	
	netflix.getWebSeries();
	}
 }