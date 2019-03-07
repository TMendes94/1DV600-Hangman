public class Play {

		public static void main(String[] args) {
		Controller.Controller c = new Controller.Controller();
		View.View v = new View.View();
		Model.Game g = new Model.Game();
		v.printGreetings();
		c.start(v,g);
		}

}
