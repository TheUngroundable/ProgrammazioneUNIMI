public class Test_loop extends AbstractTest {

    @Override
    public void go() throws Exception{
		setVal(100); // perche' va subito a 100 e verra' poi interrotto
		Thread.sleep(1000);
		go();
    }
}
