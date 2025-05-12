package com.darkorbit

interface TieredArenaEventTierUpdateCommand : ProtocolPacket {
	var playerTier: PlayerTier
}
