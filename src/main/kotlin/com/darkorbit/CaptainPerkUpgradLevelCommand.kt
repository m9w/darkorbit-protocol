package com.darkorbit

interface CaptainPerkUpgradLevelCommand : ProtocolPacket {
	var costList: MutableList<CaptainPerkUpgradLevelCostCommand>
	var modifier: Float
	var upgradeLevel: Int
}
