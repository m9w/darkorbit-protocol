package com.darkorbit

interface SpaceSearchMissionListCommand : ProtocolPacket {
	var missions: MutableList<EventQuestDefinitionModule>
}
