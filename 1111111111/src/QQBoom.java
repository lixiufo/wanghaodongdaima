	import java.awt.AWTException;
	import java.awt.Robot;
	import java.awt.Toolkit;
	import java.awt.datatransfer.Clipboard;
	import java.awt.datatransfer.StringSelection;
	import java.awt.datatransfer.Transferable;
	import java.awt.event.KeyEvent;

	public class QQBoom {
		public static void main(String[] args) throws AWTException {
			String sentence = "Äã¸öÉ³µñ,Äã¸ö´óÉµµõ,½Ð°Ö°Ö,¿ìµã½Ð°Ö°Ö";
			Robot robot = new Robot();
			robot.delay(3000);
			Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
			String[] authors = sentence.split("[,]");
			for (int j = 0; j < 500; j++) {
				for (int i = 0; i < authors.length; i++) {
					String sentencet = authors[i];
					Transferable tText = new StringSelection(sentencet);
					clip.setContents(tText, null);
					
					robot.keyPress(KeyEvent.VK_CONTROL);
					robot.keyPress(KeyEvent.VK_V);

					robot.keyRelease(KeyEvent.VK_CONTROL);
					robot.delay(500);
					robot.keyPress(KeyEvent.VK_ENTER);
				}
			}
		}
}
