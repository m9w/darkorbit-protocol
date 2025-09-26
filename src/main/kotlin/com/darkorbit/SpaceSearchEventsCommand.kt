package com.darkorbit

interface SpaceSearchEventsCommand : ProtocolPacket {
	var eventIds: MutableList<EventCommand>
	var planets: MutableList<PlanetCommand>
	var rewards: MutableList<RewardModule>
}
