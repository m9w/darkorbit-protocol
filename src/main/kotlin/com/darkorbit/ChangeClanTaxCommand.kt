package com.darkorbit

interface ChangeClanTaxCommand : ProtocolPacket {
	var errorMsg: BaseStackCommand
	var success: Boolean
	var tax: Int
}
