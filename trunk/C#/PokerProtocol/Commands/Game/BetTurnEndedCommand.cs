﻿using System.Collections.Generic;
using System.Text;
using EricUtility;
using EricUtility.Networking.Commands;
using PokerWorld.Game;
using PokerWorld.Game.Enums;

namespace PokerProtocol.Commands.Game
{
    public class BetTurnEndedCommand : AbstractJsonCommand
    {
        public static string COMMAND_NAME = "gameBET_TURN_ENDED";

        public RoundTypeEnum Round { get; set; }
        public List<int> PotsAmounts { get; set; }
    }
}
