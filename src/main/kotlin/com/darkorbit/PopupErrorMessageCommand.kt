package com.darkorbit

interface PopupErrorMessageCommand : ProtocolPacket {
	var errorCode: ERROR_CODE
}
