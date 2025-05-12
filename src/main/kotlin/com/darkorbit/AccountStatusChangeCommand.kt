package com.darkorbit

interface AccountStatusChangeCommand : ProtocolPacket {
	var premium: Boolean
}
