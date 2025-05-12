package com.darkorbit

interface SpacePlagueStatusCommand : ProtocolPacket {
	var bossSummoningInfos: MutableList<SpacePlagueBossSummoningProgressCommand>
	var infection: SpacePlagueInfectionStatusCommand
	var rating: SpacePlagueRatingStatusCommand
}
