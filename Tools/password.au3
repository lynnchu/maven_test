Local $hWnd = WinWait("Ö§¸¶±¦ ÖªÍÐ¸¶£¡ - Mozilla Firefox", "", 10);
Sleep(2000)
WinActivate("Ö§¸¶±¦ ÖªÍÐ¸¶£¡ - Mozilla Firefox");
ControlSend($hWnd, "", "[CLASS:Edit; INSTANCE:1]", $CmdLine[1]);
Sleep(2000)