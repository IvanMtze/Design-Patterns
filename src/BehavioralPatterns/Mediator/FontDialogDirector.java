package BehavioralPatterns.Mediator;

public class FontDialogDirector extends  DialogDirector{
    private Button _ok;
    private Button _cancel;
    private ListBox _fontList;
    private EntryField _fontName;
    public void widgetChanged(Widget widget){
        if(widget == _fontList){
            _fontName.setText(_fontList.getSelection());
        }else if(widget == _ok){
            //apply font change and dismiss dialog
        }else if(widget == _cancel){
            //dismiss dialog
        }
    }
    protected void createWidgets(){
        _ok = new Button(this);
        _cancel = new Button(this);
        _fontList = new ListBox(this);
        _fontName = new EntryField(this);
        //fill the listbox with the available font names
        //assemble the widgets in the dialog
    }
}
