package com.darkorbit

interface EventReturnOfHeroContributorListCommand : ProtocolPacket {
	var contributorList: MutableList<EventReturnOfHeroContributorCommand>
}
