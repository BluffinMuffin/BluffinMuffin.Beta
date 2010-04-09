﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using EricUtility;

namespace PokerProtocol
{
    public class TuplePlayerInfo
    {
        private int m_NoSeat;
        private bool m_IsEmpty;
        private String m_PlayerName;
        private int m_Money;
        private List<int> m_HoleCardIDs;
        private bool m_IsDealer;
        private bool m_IsSmallBlind;
        private bool m_IsBigBlind;
        private bool m_IsCurrentPlayer;
        private int m_TimeRemaining;
        private int m_Bet;
        private bool m_IsPlaying;

        public int NoSeat
        {
            get { return m_NoSeat; }
        }

        public bool IsEmpty
        {
            get { return m_IsEmpty; }
        }

        public String PlayerName
        {
            get { return m_PlayerName; }
        }

        public int Money
        {
            get { return m_Money; }
        }

        public List<int> HoleCardIDs
        {
            get { return m_HoleCardIDs; }
        }

        public bool IsDealer
        {
            get { return m_IsDealer; }
        }

        public bool IsSmallBlind
        {
            get { return m_IsSmallBlind; }
        }

        public bool IsBigBlind
        {
            get { return m_IsBigBlind; }
        }

        public bool IsCurrentPlayer
        {
            get { return m_IsCurrentPlayer; }
        }

        public int TimeRemaining
        {
            get { return m_TimeRemaining; }
        }

        public int Bet
        {
            get { return m_Bet; }
        }

        public bool IsPlaying
        {
            get { return m_IsPlaying; }
        }
        public TuplePlayerInfo(int noSeat, bool isEmpty, string playerName, int money, List<int> hole, bool isDealer, bool isSmallBlind, bool isBigBlind, bool isCurrentPlayer, int timeRemaining, int bet, bool isPlaying)
        {
            m_NoSeat = noSeat;
            m_IsEmpty = isEmpty;
            m_PlayerName = playerName;
            m_Money = money;
            m_HoleCardIDs = hole;
            m_IsDealer = isDealer;
            m_IsSmallBlind = isSmallBlind;
            m_IsBigBlind = isBigBlind;
            m_IsCurrentPlayer = isCurrentPlayer;
            m_TimeRemaining = timeRemaining;
            m_Bet = bet;
            m_IsPlaying = isPlaying;
        }

        public TuplePlayerInfo(int noSeat)
        {
            m_HoleCardIDs = new List<int>();
            m_NoSeat = noSeat;
            m_IsEmpty = true;
        }

        public TuplePlayerInfo(StringTokenizer argsToken)
        {
            m_HoleCardIDs = new List<int>();
            m_NoSeat = int.Parse(argsToken.NextToken());
            m_IsEmpty = bool.Parse(argsToken.NextToken());
            if (!m_IsEmpty)
            {
                m_PlayerName = argsToken.NextToken();
                m_Money = int.Parse(argsToken.NextToken());
                m_HoleCardIDs.Add(int.Parse(argsToken.NextToken()));
                m_HoleCardIDs.Add(int.Parse(argsToken.NextToken()));
                m_IsDealer = bool.Parse(argsToken.NextToken());
                m_IsSmallBlind = bool.Parse(argsToken.NextToken());
                m_IsBigBlind = bool.Parse(argsToken.NextToken());
                m_IsCurrentPlayer = bool.Parse(argsToken.NextToken());
                m_TimeRemaining = int.Parse(argsToken.NextToken());
                m_Bet = int.Parse(argsToken.NextToken());
                m_IsPlaying = bool.Parse(argsToken.NextToken());
            }
        }
        public string ToString(char p_delimiter)
        {
            StringBuilder sb = new StringBuilder();
            sb.Append(m_NoSeat);
            sb.Append(p_delimiter);
            sb.Append(m_IsEmpty);
            sb.Append(p_delimiter);
            if (!m_IsEmpty)
            {
                sb.Append(m_PlayerName);
                sb.Append(p_delimiter);
                sb.Append(m_Money);
                sb.Append(p_delimiter);
                sb.Append(m_HoleCardIDs[0]);
                sb.Append(p_delimiter);
                sb.Append(m_HoleCardIDs[1]);
                sb.Append(p_delimiter);
                sb.Append(m_IsDealer);
                sb.Append(p_delimiter);
                sb.Append(m_IsSmallBlind);
                sb.Append(p_delimiter);
                sb.Append(m_IsBigBlind);
                sb.Append(p_delimiter);
                sb.Append(m_IsCurrentPlayer);
                sb.Append(p_delimiter);
                sb.Append(m_TimeRemaining);
                sb.Append(p_delimiter);
                sb.Append(m_Bet);
                sb.Append(p_delimiter);
                sb.Append(m_IsPlaying);
                sb.Append(p_delimiter);
            }

            return sb.ToString();
        }
    }
}
