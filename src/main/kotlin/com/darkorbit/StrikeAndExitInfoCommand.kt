package com.darkorbit

interface StrikeAndExitInfoCommand : ProtocolPacket {
	var StellarCoinLimit: Int
	var currentGetStellarCoin: Int
	var inDouble: Boolean
	var inSession: Boolean
	var nextOpenSeconds: Int
}
