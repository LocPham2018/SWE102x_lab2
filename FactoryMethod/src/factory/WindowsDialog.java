package factory;

import buttons.Button;
import buttons.WindowsButton;

/**
 * Windows Dialog will produce Windows buttons.
 */
public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        // TODO Auto-generated method stub
        return new WindowsButton();
    }
    
}
