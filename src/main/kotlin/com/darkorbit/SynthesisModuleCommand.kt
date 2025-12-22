package com.darkorbit

interface SynthesisModuleCommand : ProtocolPacket {
	var affectedShip: Int
	var costs: MutableList<SynthesisCostLootCommand>
	var lootId: String
	var moduleGroupType: String
}
