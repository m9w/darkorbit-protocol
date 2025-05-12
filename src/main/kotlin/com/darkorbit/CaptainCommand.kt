package com.darkorbit

interface CaptainCommand : ProtocolPacket {
	var captainEnergy: Int
	var captainId: Int
	var captainName: String
	var captainTypeId: String
	var isSelected: Boolean
	var maxEnergy: Int
	var perkList: MutableList<CaptainPerkCommand>
	var sellItemObtained: String
	var sellingPrice: Int
}
