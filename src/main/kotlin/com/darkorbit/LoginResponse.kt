package com.darkorbit

interface LoginResponse : ProtocolPacket {
	var status: LoginResponseStatus
}
