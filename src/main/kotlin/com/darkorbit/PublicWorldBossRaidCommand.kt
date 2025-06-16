package com.darkorbit

interface PublicWorldBossRaidCommand : ProtocolPacket {
	var raidlist: MutableList<PublicWorldBossRaidIntensity>
}
