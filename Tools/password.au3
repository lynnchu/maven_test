Local $hWnd = WinWait("֧���� ֪�и��� - Mozilla Firefox", "", 10);
Sleep(2000)
WinActivate("֧���� ֪�и��� - Mozilla Firefox");
ControlSend($hWnd, "", "[CLASS:Edit; INSTANCE:1]", $CmdLine[1]);
Sleep(2000)